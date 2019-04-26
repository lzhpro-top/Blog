/**
 * 
 */
function uploadFile(callback){
	var file=$('<input type="file" name="file" id="files">');
	var form=$('<form></form>');
	file.appendTo(form);
	file.click();
	file.change(function(){
		 var formData = new FormData(form[0]);
	        $.ajax({  
	             url: '/file/upload' ,  
	             type: 'post',  
	             data: formData, 
	             async: false,  
	             cache: false,  
	             contentType: false,  
	             processData: false,  
	             success: function (path){
	            	 callback(path);
	             },  
	             error: function (err) {  
	                 alert("error");  
	             }  
	        });
    });
}