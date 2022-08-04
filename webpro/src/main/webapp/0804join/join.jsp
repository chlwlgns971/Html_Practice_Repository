<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/msStyle.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
	$(function(){
		#('checkid').on('click',function(){
			idvalue = $('#uid').val().trim();
			
			if(idvalue.length<1){
				alert("id를 입력하세요");
				return false;
			}
			console.log(idvalue);
			$.ajax({
				url: '/webpro/checkById.do',
				type: 'get',
				data : {"id" : idvalue},
				success : function(res) {
					
				},
				error : function(xhr){
					
				},
				dataType: 'json'
			})
		})
	})
</script>
</head>
<body>
	<div class="box">
		<div class="container">
  			<form action="" class="needs-validation" novalidate>
  				<div class="form-group">
     				<label for="uid">Id:</label>
     				<input type="button" id="checkid" value="중복검사" class="btn btn-outline-primary ">
      				<input type="text" class="form-control" id="uid" placeholder="Enter userId" name="mem_id" required> <!--required는 필수입력항목 -->
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
     				<label for="uname">Username:</label>
      				<input type="text" class="form-control" id="uname" placeholder="Enter username" name="mem_name" required>
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
      				<label for="pwd">Password:</label>
      				<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="mem_pass" required>
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
      				<label for="ubir">Birth:</label>
      				<input type="date" class="form-control" id="ubir" placeholder="Enter Birthday" name="mem_bir" required>
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
      				<label for="uzip">Zip:</label>
      				<input type="button" value="search zip number" class="btn btn-success btn-sm">
      				<input type="text" class="form-control" id="uzip" placeholder="Enter Zip Number" name="mem_zip" required>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
      				<label for="uadd1">Address1:</label>
      				<input type="text" class="form-control" id="uadd1" placeholder="Enter Address1" name="mem_add1" required>
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
      				<label for="uadd2">Address2:</label>
      				<input type="text" class="form-control" id="uadd2" placeholder="Enter Address2" name="mem_add2" required>
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
      				<label for="uhp">Phone Number:</label>
      				<input type="text" class="form-control" id="uhp" placeholder="Enter Phone Number" name="mem_hp" required>
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<div class="form-group">
      				<label for="umail">Email:</label>
      				<input type="text" class="form-control" id="umail" placeholder="Enter Email" name="mem_mail" required>
      				<div class="valid-feedback">Valid.</div>
      				<div class="invalid-feedback">Please fill out this field.</div>
    			</div>
    			<!-- <div class="form-group form-check">
     				<label class="form-check-label">
	        			<input class="form-check-input" type="checkbox" name="remember" required> I agree on blabla.
	        			<div class="valid-feedback">Valid.</div>
	        			<div class="invalid-feedback">Check this checkbox to continue.</div>
      				</label>
    			</div> -->
    			<button type="submit" class="btn btn-primary">Submit</button>
 		 	</form>
		</div>
	</div>
</body>
</html>