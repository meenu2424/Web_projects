<!DOCTYPE html>
<html>
<head>
<script>
var text="Hi how are you doing? my name is Meenu Meenu and i am from India Meenu ";
var myName="Meenu";
var hits=[];
for(var i=0;i<text.length;i++){
 if(myName="M"){
	 for(var j=i;j<(myName.length+i);j++){
	 hits.push(text[j]);
	 
	 }

 }

}

if (hits.length === 0) 
{
	
document.write("Your name wasn't found!");

} 
else {
	
document.write(hits);
}






</script>
</head>
<body>
</body>
</html>