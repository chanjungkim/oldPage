(function() {
	var video = document.getElementById('video'),
		canvas = document.getElementById('canvas'),
		context = canvas.getContext('2d'),
		vendorUrl = window.URL || window.webkitURL;
		
	navigator.getMedia = 	navigator.getUserMedia ||
							navigator.webkitGetUserMedia ||
							navigator.mozGetUserMedia ||
							navigator.msGetUserMedia;
		
	navigator.getMedia({
		video: true,
		audio: true
	}, function(stream) {
		video.src = vendorUrl.createObjectURL(stream);
		video.play();
	}, function(error) {
		// An error occured
		// error.code
	});
	
	video.addEventListener('play', function(){
		draw(this, context, 400, 300);
	}, false);
	
	function draw(video, context, width, height){
		var image, data, i, r, g, b, brightness;
		
		context.drawImage(video, 0, 0, width, height);
		
		image = context.getImageData(0, 0, width, height);
		data = image.data;
		
		//console.log(data);
		//color modify 
		for(i = 0 ; i < data.length ; i = i + 4){
			r = data[i];
			g = data[i+1];
			b = data[i+2];
			brightness = (r + b + g) / 3; 
			
			data[i] = data[i + 1] = data[i + 2] = brightness;
		}
		
		image.data = data;
		
		context.putImageData(image, 0, 0);
		
		setTimeout(draw, 10, video, context, width, height);
	};
	
})();
