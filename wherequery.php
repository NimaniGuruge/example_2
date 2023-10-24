<?php
$servername = "localhost";
$username = "username" ;
$password = "password" ;
$dbname = "mydb" ;

$conn = new mysqli($servername,$username,$password,$dbname);

if($conn->connect_error){
die ("connection failed :".$conn->connect_error);
}
$sql = select * from myguest where id_no = 1001 ;
$result = $conn->query($sql) ;

if($result>num_rows>0){
echo "<table><tr><th>id_no</th><th>firstname</th><th>lastname</th></tr> ;
while($row = $result->fetch_asso()){
echo "<tr><td>".$row["id_no"]."</td><td>".$row["firstname"]."</td><td>".$row["lastname"]."</td></tr>" ;
}
echo "</table>";
}
else{
echo "result 0"
}
$conn->close();
?>