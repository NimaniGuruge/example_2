<?php
$server = "localhost";
$username = "username";
$password = "password";
$dbname = "myDB" ;

// create connection
$conn = new mysqli($server,$username,$password,$dbname);

// check connection
if($conn->connect_error){
die ("connection error :".$conn->connect_error) ;
}

$sql = create table myguest(
       ID_No int primary key,
       first_name vachar(20) not null,
       last_name vachar(20) not null,
);

if($conn->query($sql === True){
echo "create table successfuly";
}
else{
echo "Error:".$sql."<br>".$conn->error;
}
$conn->close();
?>