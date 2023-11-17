<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Project 1</title>
        <link rel="stylesheet" href="index.css">
        <link href="https://fonts.googleapis.com/css?family=Material+Icons%7CMaterial+Icons+Outlined%7CMaterial+Icons+Two+Tone%7CMaterial+Icons+Round%7CMaterial+Icons+Sharp" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Inter' rel='stylesheet'>
    </head>
<html?>
<h1> CarProject</h1>
<?php
    $Plate_Num = $_POST["PlateNumber"]
    $Price = $_POST["Price"]
    $Type = $_POST["Type"]
    $Brand = $_POST["Brand"]
    $Model = $_POST["Model"]
    $Year = $_POST["Year"]
    $Mileage = $_POST["Mileage"]
    $Color = $_POST["Color"]
    $Engine = $_POST["Engine"]
    $GasType = $_POST["GasType"]
    $Carlot = $_POST["Carlot"]
    $LotNumber = $_POST["LotNumber"]
    $Available = $_POST["Available"]
    //Database Connection
    $conn = new mysqli('localhost', 'root' , 'test');
    if($conn->connect_error){
        die ('Connection Failed: ' .$conn->connect_error);
    }else{
        $stmt = $conn->prepare("Insert into Form(Plate_Num, Price, Engine, Color, Gas_Type, Milage, Available, 
        Brand, Model, Type, Year) values(?,?,?,?,?,?,?,?,?,?,?,? ")
        $stmt->bind_param("iisssissisi", $Plate_Num, $Price , $Engine, $Color, $Gas_Type, $Milage, $Available, 
        $Brand, $Model, $Type, $Year);
         $stmt->execute();
         echo "Success"
         $stmt->close();
         $conn->close();
    }
?>
</html>