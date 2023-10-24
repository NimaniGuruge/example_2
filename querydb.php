<?php
$servername = "localhost" ;
$username = "username" ;
$password = "password" ;
$dbname  = "myDB ;

// create connection
$conn = new mysqli($servername,$username,$password,$dbname);

//check connection
if($conn->connect_error){
die ("connection failed :".$conn->connect_error):
}

//select query
$sql = select * from myguest ;
$result = $conn->query($sql) ;
if($result>num_rows>0){
echo "<table><tr><th>ID</th><th>Name</th></tr> " ;

//output data of each row
while($row = $result->fetch_asso()){
echo "<tr><td>".$row["id"]."</td><td>".$row["first_name"]."</td><td>".$row["lastname"]."</td></tr>" ;
}
echo "</table>" ;
}else{
echo "0 result" ;
}
$conn->close() ;
?>

