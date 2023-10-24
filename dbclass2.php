<?php
class database{
private $servername;
private $username;
private $password;
private $dbname;
private $conn;

public function __constuctor($servername,$username,$password,$dbname){
$this->servername;
$this->username;
$this->password;
$this->dbname;

$this->conn = new mysqli($this->servername,$this->username,$this->password,$this->dbname);
if(this->conn->connect_error){
 die("connection failed:".$this->conn->connect_error);

}
}
public function getdata(){
$sql2= "SELECT * from person";
$result = mysqli_query($this->conn,$sql2);
if(!result){
die("error".$conn->error);
}

if$result>num_rows>0){
echo "<table>";
echo "<tr><th>NAME</th><th>ID_NO</th><th>AGE</th><tr>";
while($row = $result->fetch_assoc()){
echo "<tr>";
echo "<td>".$row[NAME]."</td>";
echo "<td>".$row[ID_NO]."</td>";
echo "<td>".$row[AGE]."</td>";
echo "</tr>";
};
echo "</table>";
}else{
echo "no record found";
}
mysqli_close($this->conn);
}
public function insertdata($NAME,$ID_NO,$AGE){
$NAME = $_POST[NAME];
$ID_NO = $_POST[ID_NO];
$AGE = $_POST[AGE];

$sql3 = "INSERT INTO person (NAME,ID_NO,AGE)values ("amal",0051,25)";
if(mysqli_query($this->conn,$sql3){
echo "data inserted successfully";
}else{
echo "error:".$this->conn->error;
}
mysqli_close($this->conn);
}
}
$db = new database("localhost","root","123","abccompany");
if (isset($_POST["NAME"]) && isset($_POST["ID_NO"])&& isset($_POST["AGE"])){
$NAME = $_POST["NAME"];
$ID_NO = $_POST["ID_NO"];
$AGE = $_POST["AGE"];
 
$db->insertdata($NAME,$ID_NO,$AGE);
}else{
echo "form not submited"."<br>";
}
$db->getdata();
?>




