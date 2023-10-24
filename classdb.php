<?php
class database{
private $servername;
private $username;
private $password;
private $dbname;
private $conn ;

public function __construct($servername,$username,$password,$dbname){
$this->servername = $servername ;
$this->username = $username ;
$this->password = $password ;
$this ->dbname = $dbname ;

$this->conn = new mysqli($this->servername,$this->username,$this->password,$this->dbname);
if($this->conn->connect_error){
die ("connection failed :".$this->conn->connect_error);
}
$sql1 = select * from tablename ;
$result = mysqli_query($this->conn,$sql1);
if(!$result){
die "Error:".$conn->error ;
}
if($result>Num_row>0){
echo "<table><tr><th>ID</th><th>Name</th><th>age</th></tr>";
while($row = $result->fetch assoc()){
echo "<tr>";
echo "<td>".$row[0001]."</td>";
echo "<td>".$row["fname"]."</td>";
echo "<td>".$row["lastname"]."</td></tr>";
}
echo </table>;
}
else{
echo "no record found" ;
}
mysqli_close($this->conn);
}

public function insertdata($id,$name,$age){
$this->id = $id;
$this->name = $name;
$this->age = $age;

$sql2= insert into tablename(id,name,age)values("id","name",age);
if(mysql_query(($this->conn,$sql2){
echo "data inserted to the table successfuly";
}else{
echo "eror:".$this->conn->error;
}
mysqli_close($this->conn);
}
}
$db = new database("localhost","username""password","dbname");
if(isset($_POST["ID"]) && isset($_POST["name"])){
$id = $_POST("id");
$name = $_POST("name");
$age = $_POST("age");

$db->insertdata($id,$name,$age);
}
else{
echo "not successfully"
}
$db->getdata();
?>






