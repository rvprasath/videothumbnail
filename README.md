# videothumbnail
<b>video thumbnail creation library for vpplayer</b>

<b>Dependency</b><br/>
This thumbnail creation process requires <pre><b>videoThumbnail.jar</b></pre> along with <b>jcodec-javase-0.2.2.jar</b> and <b>jcodec-0.2.2.jar</b>

The <pre><b>jcodec-javase-0.2.2.jar</b></pre> and <pre><b>jcodec-0.2.2.jar</b></pre> can be imported directly from maven repository too.


<pre>
public class createVideoThumbnail {	
public static void main(String[] args) {
  
	  CreateImageFrame createImageFrame = new CreateImageFrameProcess();
    
	  FrameData frameData = createImageFrame.decodeVideoFrames(inputPath, outputpath, filename, secondsperframe, imageformat);
    
          ImageJoiner imageJoiner = new ImageJoinProcess();
    
	  ImageJoinData imgdata = imageJoiner.generateMergedImage(frameData, column, row, height, width);
    
	}
}
</pre>
<h2></h2>

<code>CreateImageFrame</code> Interface contains <code>decodeVideoFrames</code> method that is used to extract and create individual frames from video.<br/>

This overridden method can be called using different parameter values.<br/>
<ul><li><code>decodeVideoFrames(String inputPath, String outputPath, String inputFileName)</code></li><br/>
<li><code>decodeVideoFrames(String inputPath, String outputPath, String inputFileName, int secondsPerFrame)</code></li><br/>
<li><code>decodeVideoFrames(String inputPath, String outputPath, String inputFileName, int secondsPerFrame, String imageFormat)</code></li></ul>

<b>decodeVideoFrames</b> parameters description.<br/>

<table>
<thead>
<tr>
<th>Parameter</th>
<th>value</th>
</tr>
</thead>
<tbody>
<tr>
<td><b>inputPath</b></td>
<td>The input path of the video file.</td>
</tr>
<tr>
<td><b>outputPath</b></td>
<td>The output path to save the extracted frames and created thumbnail.</td>
</tr>
<tr>
<td><b>inputFileName</b></td>
<td>The file name of the input video.</td>
</tr>
<tr>
<td><b>secondsPerFrame</b></td>
<td>This parameter describes a single thumbnail frames to show for particular time interval when hover on the video player seekbar.
<b>ex : if the parameter is 5, then the thumnail frame changes for every 5 seconds on seekbar.<b/></td>
</tr>
<tr>
<td><b>imageFormat</b></td>
<td>Describes the image format of the output thumnail image. <b>Default is "png".</b></td>
</tr>
</tbody>
</table>
<h2></h2>

<code>ImageJoiner</code> Interface contains <code>generateMergedImage</code> method that is used to merge individual frames from video into individual thumbnail image.<br/>

This overridden method can be called using different parameter values<br/>
<ul><li><code>generateMergedImage(FrameData frameData)</code></li><br/>
<li><code>generateMergedImage(FrameData frameData, int column, int row, int height, int width)</code></li></ul>

<pre><b>NOTE : </b>The <b>decodeVideoFrames</b> method returns <b>FrameData</b> object that is needed to initiate merge image process.</pre>

The parameters <b>column, row, height, width</b> are not used the process uses its default value to generate merged images.

<b>generateMergedImage</b> parameter description.<br/>

<table>
<thead>
<tr>
<th>Parameter</th>
<th>value</th>
</tr>
</thead>
<tbody>
<tr>
<td><b>FrameData</b></td>
<td><b>decodeVideoFrames</b> returns FrameData</b> which contains information of the extracted video frames.</td>
</tr>
<tr>
<td><b>column</b></td>
<td>Describes the number of image frames in horizontal manner in the thumbnail image.</td>
</tr>
<tr>
<td><b>row</b></td>
<td>Describes the number of image frames in vertical manner in the thumbnail image.</td>
</tr>
<tr>
<td><b>height</b></td>
<td>Describes the height of the individual frames.</td>
</tr>
<tr>
<td><b>width</b></td>
<td>Describes the width of the individual frames.</td>
</tr>
</tbody>
</table>

<code>generateMergedImage</code> method returns <code>ImageJoinData</code> object.<br/>
<pre><b>ImageJoinData</b> object is used to initialize vpplayer thumbnail by passing it as a parameter.</pre>

<table>
<thead>
<tr>
<th>Parameter</th>
<th>value</th>
</tr>
</thead>
<tbody>
<tr>
<td><b>height</b></td>
<td>height of the thumbnail.</td>
</tr>
<tr>
<td><b>width</b></td>
<td>width of the thumbnail.</td>
</tr>
<tr>
<td><b>nh</b></td>
<td>nh number of image frame columns thumbnail.</td>
</tr>
<tr>
<td><b>nv</b></td>
<td>nv number of image frame rows in thumbnail.</td>
</tr>
<tr>
<td><b>secPerFrames</b></td>
<td>seconds per individual frame.</td>
</tr>
<tr>
<td><b>thumbNails</b></td>
<td>thumbNails having list of thumbnails file names.</td>
</tr>
<tr>
<td><b>posters</b></td>
<td>posters having three poster files from selective frames among which one can be declared as video poster.</td>
</tr>
<tr>
<td><b>absolutePath</b></td>
<td>absolutePath gives the path of the directory.</td>
</tr>
</tbody>
</table>


<h2><a href="#license" aria-hidden="true" class="anchor" id="user-content-license"><svg aria-hidden="true" class="octicon octicon-link" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>license</h2>
<p>MIT. Copyright (c) <a href="https://github.com/rvprasath/" rel="nofollow">rvprasath</a>.</p>
