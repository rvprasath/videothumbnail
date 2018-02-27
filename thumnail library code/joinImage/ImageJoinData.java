package com.videoDecoder.joinImage;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <code>ImageJoinData</code> class is an encapsulated class to get all the
 * values after image join process. This class contains the information about
 * the joined image from video frames such as height, width, number of columns,
 * number of rows, joined thumbnail images name, and video posters name
 * generated in the image joining process.</br></br>
 * 
 * <code>height</code> height of the image slides in image file.</br>
 * <code>width</code> width of the image slides in image file.</br>
 * <code>nh</code> number of horizontal slides i.e column.</br>
 * <code>nv</code> number of vertical slides i.e row.</br>
 * <code>secPerFrames</code> number of frames per second.</br>
 * <code>thumbNails</code> list of joined image files.</br>
 * <code>posters</code> posters for video from frames</br>
 * <code>absolutePath</code> absolute path of the joined image.</br>
 * 
 * @author Vishnu Prasath
 *
 */
public class ImageJoinData {

	private int height;
	private int width;
	private int nh;
	private int nv;
	private int secPerFrames;
	private LinkedList<String> thumbNails;
	private ArrayList<String> posters;
	private String absolutePath;

	/**
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return nh
	 */
	public int getNh() {
		return nh;
	}

	/**
	 * @param nh
	 */
	public void setNh(int nh) {
		this.nh = nh;
	}

	/**
	 * @return nv
	 */
	public int getNv() {
		return nv;
	}

	/**
	 * @param nv
	 */
	public void setNv(int nv) {
		this.nv = nv;
	}

	/**
	 * @return secPerFrames
	 */
	public int getSecPerFrames() {
		return secPerFrames;
	}

	/**
	 * @param secPerFrames
	 */
	public void setSecPerFrames(int secPerFrames) {
		this.secPerFrames = secPerFrames;
	}

	/**
	 * @return thumbNails
	 */
	public LinkedList<String> getThumbNails() {
		return thumbNails;
	}

	/**
	 * @param thumbNails
	 */
	public void setThumbNails(LinkedList<String> thumbNails) {
		this.thumbNails = thumbNails;
	}

	/**
	 * @return posters
	 */
	public ArrayList<String> getPosters() {
		return posters;
	}

	/**
	 * @param posters
	 */
	public void setPosters(ArrayList<String> posters) {
		this.posters = posters;
	}

	/**
	 * @return absolutePath
	 */
	public String getAbsolutePath() {
		return absolutePath;
	}

	/**
	 * @param absolutePath
	 */
	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

}
