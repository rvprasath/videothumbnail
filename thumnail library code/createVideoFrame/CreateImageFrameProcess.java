package com.videoDecoder.createVideoFrame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.model.Picture;
import org.jcodec.scale.AWTUtil;

/**
 * The <code>CreateImageFrameProcess</code> class implements
 * <code>CreateImageFrame</code> interface which is used to decode video files into
 * image frames. This interface contains abstract methods which is overridden on
 * call and provide appropriate implementation for respective method calls. <br>
 * <br>
 * <b>inputPath</b> - Directory path of the input file <br>
 * <b>outputPath</b> - Directory path of the output file <br>
 * <b>InputFileName</b> - File name of the input video <br>
 * <b>outputFileName</b> - File name of the output image frames <br>
 * <b>startSecond</b> - This parameter is used to start decoding video frames
 * from particular seconds <br>
 * <b>secondsPerFrame</b> - Enables decoder to create video image frame for
 * particular interval of time. Provide periodic interval between each generated
 * frame.
 * 
 * @author Vishnu Prasath
 *
 */
public class CreateImageFrameProcess implements CreateImageFrame {

	private final static int DEFAULT_FRAMES_PER_SEC = 10;
	int renderedFrame = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.videoDecoder.createVideoFrame.CreateImageFrame#decodeVideoFrames(java
	 * .lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public FrameData decodeVideoFrames(String inputPath, String outputPath, String inputFileName) {
		try {
			int totalFrameCount = createFramesFromVideoFile(inputPath, outputPath, inputFileName, "frame", 1, "png");
			FrameData frameData = new FrameData();
			frameData.setInputPath(inputPath);
			frameData.setOutputPath(outputPath);
			frameData.setInputFileName(inputFileName);
			frameData.setOutputFileName("frame");
			frameData.setSecondsPerFrame(1);
			frameData.setTotalFrameCount(totalFrameCount);
			frameData.setImageFormat("png");
			return frameData;
		} catch (Exception e) {
			e.printStackTrace();
			return new FrameData();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.videoDecoder.createVideoFrame.CreateImageFrame#decodeVideoFrames(java
	 * .lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 */
	@Override
	public FrameData decodeVideoFrames(String inputPath, String outputPath, String inputFileName, int secondsPerFrame) {
		try {
			int totalFrameCount = createFramesFromVideoFile(inputPath, outputPath, inputFileName, "frame",
					secondsPerFrame, "png");
			FrameData frameData = new FrameData();
			frameData.setInputPath(inputPath);
			frameData.setOutputPath(outputPath);
			frameData.setInputFileName(inputFileName);
			frameData.setOutputFileName("frame");
			frameData.setSecondsPerFrame(secondsPerFrame);
			frameData.setTotalFrameCount(totalFrameCount);
			frameData.setRenderedFrame(renderedFrame);
			frameData.setImageFormat("png");
			return frameData;
		} catch (Exception e) {
			e.printStackTrace();
			return new FrameData();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.videoDecoder.createVideoFrame.CreateImageFrame#decodeVideoFrames(java
	 * .lang.String, java.lang.String, java.lang.String, java.lang.String, int,
	 * java.lang.String)
	 */
	@Override
	public FrameData decodeVideoFrames(String inputPath, String outputPath, String inputFileName, int secondsPerFrame,
			String imageFormat) {
		try {
			int totalFrameCount = createFramesFromVideoFile(inputPath, outputPath, inputFileName, "frame",
					secondsPerFrame, imageFormat);
			FrameData frameData = new FrameData();
			frameData.setInputPath(inputPath);
			frameData.setOutputPath(outputPath);
			frameData.setInputFileName(inputFileName);
			frameData.setOutputFileName("frame");
			frameData.setSecondsPerFrame(secondsPerFrame);
			frameData.setTotalFrameCount(totalFrameCount);
			frameData.setRenderedFrame(renderedFrame);
			frameData.setImageFormat(imageFormat);
			return frameData;
		} catch (Exception e) {
			e.printStackTrace();
			return new FrameData();
		}

	}

	/**
	 * This <code>createFramesFromVideoFile</code> method is used to process
	 * video and generate frames from the video with the specified period of
	 * time.
	 * 
	 * @param inputPath
	 * @param outputPath
	 * @param InputFileName
	 * @param outputFileName
	 * @param secondsPerFrame
	 * @param imageFormat
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws JCodecException
	 */
	private int createFramesFromVideoFile(String inputPath, String outputPath, String InputFileName,
			String outputFileName, int secondsPerFrame, String imageFormat)
			throws FileNotFoundException, IOException, JCodecException {

		File file = Paths.get(inputPath + "/" + InputFileName).toFile();
		FrameGrab frame = FrameGrab.createFrameGrab(NIOUtils.readableChannel(file));

		int totalNumberOfFrames = 0;
		Picture picture;
		// System.out.println(frame.getVideoTrack().getMeta().getTotalFrames());
		// while (null != (picture = frame.getNativeFrame())) {
		// totalNumberOfFrames++;
		// }
		totalNumberOfFrames = frame.getVideoTrack().getMeta().getTotalFrames();

		int noOfFrames = Math.round((totalNumberOfFrames / DEFAULT_FRAMES_PER_SEC));
		for (int i = 0; i < noOfFrames; i = (i + secondsPerFrame)) {
			picture = FrameGrab.getFrameAtSec(file, i);
			BufferedImage bufferedImage = AWTUtil.toBufferedImage(picture);
			ImageIO.write(bufferedImage, imageFormat, new File(outputPath, outputFileName + i + "." + imageFormat));
			renderedFrame++;
		}
		return noOfFrames;
	}

}
