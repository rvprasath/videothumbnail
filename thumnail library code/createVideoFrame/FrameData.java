package com.videoDecoder.createVideoFrame;

/**
 * <code>FrameData</code> class is an encapsulated class used to get all the
 * values from the image decoded process result and used it in the
 * <code>ImageJoiner</code> class to create merged image.
 * 
 * @author Vishnu Prasath
 *
 */
public class FrameData {

	private String inputPath;
	private String outputPath;
	private String InputFileName;
	private String outputFileName;
	private int secondsPerFrame;
	private int totalFrameCount;
	private int renderedFrame;
	private String imageFormat;

	/**
	 * @return inputPath
	 */
	public String getInputPath() {
		return inputPath;
	}

	/**
	 * @param inputPath
	 */
	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	/**
	 * @return outputPath
	 */
	public String getOutputPath() {
		return outputPath;
	}

	/**
	 * @param outputPath
	 */
	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	/**
	 * @return InputFileName
	 */
	public String getInputFileName() {
		return InputFileName;
	}

	/**
	 * @param inputFileName
	 */
	public void setInputFileName(String inputFileName) {
		InputFileName = inputFileName;
	}

	/**
	 * @return outputFileName
	 */
	public String getOutputFileName() {
		return outputFileName;
	}

	/**
	 * @param outputFileName
	 */
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	/**
	 * @return secondsPerFrame
	 */
	public int getSecondsPerFrame() {
		return secondsPerFrame;
	}

	/**
	 * @param secondsPerFrame
	 */
	public void setSecondsPerFrame(int secondsPerFrame) {
		this.secondsPerFrame = secondsPerFrame;
	}

	/**
	 * @return totalFrameCount
	 */
	public int getTotalFrameCount() {
		return totalFrameCount;
	}

	/**
	 * @param totalFrameCount
	 */
	public void setTotalFrameCount(int totalFrameCount) {
		this.totalFrameCount = totalFrameCount;
	}

	/**
	 * @return renderedFrame
	 */
	public int getRenderedFrame() {
		return renderedFrame;
	}

	/**
	 * @param renderedFrame
	 */
	public void setRenderedFrame(int renderedFrame) {
		this.renderedFrame = renderedFrame;
	}

	/**
	 * @return imageFormat
	 */
	public String getImageFormat() {
		return imageFormat;
	}

	/**
	 * @param imageFormat
	 */
	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
	}
}
