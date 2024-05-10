<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.MemberDTO"%>

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
<jsp:include page="../../view/top.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2 sidenav">
				<jsp:include page="../../layout/emp_menu.jsp"></jsp:include>
			</div>
			
			<% MemberDTO data = (MemberDTO) request.getAttribute("data"); %>
			<% if(data != null) { %>
				<div class="col-lg-10">
					<div class="container-fluid">
						<form role="form" class="form-horizontal" action="" method="get">
							<fieldset>
								<div id="legend">
									<legend>아래 양식을 작성해주세요.</legend>
								</div>
								<%-- <div class="form-group">
									<!-- 부서코드 -->
									<label class="control-label col-sm-2" for="deptcode">부서코드</label>
									<div class="col-sm-3">
										<h1><%= data.getId() %>의 정보</h1>
									</div>
								</div> --%>
			
								<div class="form-group">
									<!-- 성명-->
									<label class="control-label col-sm-2" for="name">성명</label>
									<div class="col-sm-3">
										<h2><%= data.getName() %></h2>
									</div>
								</div>	
												
								<div class="form-group">
									<!-- 아이디-->
									<label class="control-label col-sm-2" for="id">아이디</label>
									<div class="col-sm-3">
										<h2><%= data.getId() %></h2>
									</div>
								</div>
								<div class="form-group">
									<!-- 주소-->
									<label class="control-label col-sm-2" for="addr">주소</label>
									<div class="col-sm-3">
										<h2><%= data.getAddr() %></h2>
									</div>
								</div>
			
								<div class="form-group">
									<!-- 가입날짜-->
									<label class="control-label col-sm-2" for="regdate">가입날짜</label>
									<div class="col-sm-3">
										<h2><%= data.getRegDate() %></h2>
									</div>
								</div>
								<div class="form-group">
									<!-- 포인트-->
									<label class="control-label col-sm-2" for="point">포인트</label>
									<div class="col-sm-3">
										<h2><%= data.getPoint() %></h2>
									</div>
								</div>
								<div class="form-group">
									<!-- 비고-->
									<label class="control-label col-sm-2" for="info">비고</label>
									<div class="col-sm-3">
										<h2><%= data.getInfo() %></h2>
									</div>
								</div>
								<div class="form-group">
									<!-- Button -->
									<div class="col-sm-3 col-sm-offset-2">
										<input type="button"
										 value="수정" class="btn btn-success"/>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
	  		<% } %>
		</div>
	</div>
</body>
</html>