package com.videoDecoder.createVideoFrame;

/**
 * The <code>CreateImageFrameFromVideo</code> interface is used to decode video
 * files into image frames. This interface contains abstract methods which is
 * overridden on call and provide appropriate implementation for respective
 * method calls. <br>
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
public interface CreateImageFrame {

	/**
	 * This method generate image frame from the given parameters with default
	 * outputFileName and secondsPerFrame
	 * 
	 * @param inputPath
	 * @param outputPath
	 * @param InputFileName
	 * @return Returns the <code>int</code> value
	 */
	public FrameData decodeVideoFrames(String inputPath, String outputPath, String InputFileName);

	/**
	 * This method generate image frame from the given parameters
	 * 
	 * @param inputPath
	 * @param outputPath
	 * @param InputFileName
	 * @param secondsPerFrame
	 * @return Returns the <code>int</code> value
	 */
	public FrameData decodeVideoFrames(String inputPath, String outputPath, String InputFileName, int secondsPerFrame);

	/**
	 * This method generate image frame from the given parameters
	 * 
	 * @param inputPath
	 * @param outputPath
	 * @param InputFileName
	 * @param secondsPerFrame
	 * @param imageFormat
	 * @return Returns the <code>int</code> value
	 */
	public FrameData decodeVideoFrames(String inputPath, String outputPath, String InputFileName, int secondsPerFrame,
			String imageFormat);
}
