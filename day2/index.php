<?php
include("include/header.php");
$query="select  c_name,c_description,c_status from course";
$result=mysqli_query($con,$query);
if (!$result) {
    die("Query failed: " . mysqli_error($con));
}
?>
<table>
    <tr>
        <th>Course Name</th>
        <th>Description</th>
        <th>Status</th>
    </tr>
<?php
while($fetch=mysqli_fetch_object($result)){
?>
<tr>
    <td><?php echo $fetch->c_name;?></td>
    <td><?php echo $fetch->c_description;?></td>
    <td><?php echo $fetch->c_status;?></td>
</tr>
<?php
}
?>
</table>
<?php
include("include/footer.php");
?>
