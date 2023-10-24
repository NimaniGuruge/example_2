<?php
db = mysqli_connect("localhost","root","123","ABC_COMPANY");
if($conn->connect_error){
die "database connection failed:".$conn->connect_error;
}else{
echo "database connected";
}

//delete
$sql = "DELETE from persons WHERE ID_NO = 0011";
if(mysqli_query($conn,$sql)){
echo "data deleted successfully";
}else{
echo "error:"$conn->error;
}