<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
			<div class="col-lg-10">
				<a href="/examspring/insert2"><h1>회원목록보기</h1></a>
				<form role="form" class="form-horizontal"
					action="/examspring/insert2" method="POST" 
					name="myform">
					<fieldset>
						<div id="legend">
							<legend>아래 양식을 작성해주세요.</legend>
						</div>
						<div class="form-group">
							<!-- 부서코드 -->
							<label class="control-label col-sm-2" for="orgcode">부서코드</label>
							<div class="col-sm-3">
								<input type="text" id="deptCode" name="deptCode"
									placeholder="아이디" class="form-control"
									 required>
							</div>
						</div>
						<div class="form-group">
							<!-- 패스워드-->
							<label class="control-label col-sm-2" for="orgname">부서명</label>
							<div class="col-sm-3">
								<input type="text" id="deptName" name="deptName"
									placeholder="패스워드" class="form-control" minlength="4" >
	
							</div>
						</div>
						
						
						<div class="form-group">
							<!-- 성명-->
							<label class="control-label col-sm-2" for="orgtel">부서번호</label>
							<div class="col-sm-3">
								<input type="text" id="tel" name="tel"
									placeholder="성명" class="form-control" minlength="3" required>
	
							</div>
						</div>
					
						<div class="form-group">
							<!-- 주소-->
							<label class="control-label col-sm-2" for="addr">주소</label>
							<div class="col-sm-3">
								<input type="text" id="addr" name="addr" 
								placeholder="주소"
									class="form-control" minlength="4" required>
	
							</div>
						</div>
						
						<div class="form-group">
							<!-- Button -->
							<div class="col-sm-3 col-sm-offset-2">
								<input type="submit" value="가입하기" class="btn btn-success"/>
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
			
</body>
</html>