
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
	</style>
 </head>
	
<body>
	<div class="container-fluid">
			
			<form  class="form-horizontal"			action="/examspring2/member/insert.do" 
				method="POST" enctype="multipart/form-data"				name="myform">
				<fieldset>
					<div id="legend">
					</div>
					<div class="form-group" style="padding: 40px">
						<p class="centered">
							<img src="/examspring2/images/playdata1.jpg" 
							 id="userImage" style="width: 100px">
						</p>
						<div>
							<input type="file" name="userImage"
								onchange="document.getElementById('userImage').src = window.URL.createObjectURL(this.files[0])"
								accept="image/*">
						</div>
					</div>
					
					<div class="form-group">
						<!-- 부서코드 -->
						<label class="control-label col-sm-2" for="orgcode">부서코드</label>
						<div class="col-sm-3">
							<select name="deptno" class="form-control" >
								<c:forEach var="list" items="${list}">
									<option value="${list.deptno}">${list.deptname}</option>
								</c:forEach>
							</select>
						</div>
					</div>
		
					
					
					<div class="form-group">
						<!-- 성명-->
						<label class="control-label col-sm-2" for="orgname">성명</label>
						<div class="col-sm-3">
							<input type="text" id="orgname" name="name"
								placeholder="성명" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group checkId">
						<!-- 사번-->
						<label class="control-label col-sm-2" for="id">사번</label>
						<div class="col-sm-3">
							<input type="text" id="id" name="id"
								placeholder="사번" class="form-control" 
								minlength="4"  >
						</div>
						<span id="checkId" style="color: red;"></span>
					</div>
					<div class="form-group">
						<!-- 패스워드-->
						<label class="control-label col-sm-2" for="pass">패스워드</label>
						<div class="col-sm-3">
							<input type="text" id="pass" name="pass"
								placeholder="패스워드" class="form-control" >

						</div>
					</div>
					<div class="form-group">
						<!-- 주민번호-->
						<label class="control-label col-sm-2" for="ssn">주민번호</label>
						<div class="col-sm-3">
							<input type="text" id="ssn" name="ssn"
								placeholder="주민번호" class="form-control" 
								 >

						</div>
					</div>
					<div class="form-group">
						<!-- 생일-->
						<label class="control-label col-sm-2" for="birthday">생년월일</label>
						<div class="col-sm-3">
							<input type="text" id="birthday" name="birthday"
								placeholder="생년월일" class="form-control" 
								 >

						</div>
					</div>
					<div class="form-group">
						<!-- 결혼유무-->
						<label class="control-label col-sm-2" for="marry">결혼유무</label>
						<div class="col-sm-3">
							<input type="checkbox" id="marry" name="marry"
								placeholder="결혼유무"	 value="1">결혼유무

						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label">우편번호</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="zipcode"
								id="zipcode" >
						</div>
						<div class="col-sm-2">
							<button type="button"
								class="btn btn-round btn-primary form-control">우편번호 검색</button>
						</div>
					</div>
					<div class="form-group">
						<!-- 주소-->
						<label class="control-label col-sm-2" for="addr">주소</label>
						<div class="col-sm-6">
							<input type="text" id="addr" name="addr" 
							placeholder="주소"
								class="form-control" >
							
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label"></label>
						<div class="col-sm-5">
							<input type="text" class="form-control" name="detailaddr"
								id="detailaddr">
						</div>
					
					</div>
					<div class="form-group">
						<!-- 집전화-->
						<label class="control-label col-sm-2" for="phonehome">집전화</label>
						<div class="col-sm-5">
							<input type="text" id="phonehome" name="phonehome" 
							placeholder="집전화"
								class="form-control" >

						</div>
					</div>
					<div class="form-group">
						<!-- 회사전화-->
						<label class="control-label col-sm-2" for="phoneco">회사전화</label>
						<div class="col-sm-5">
							<input type="text" id="phoneco" name="phoneco" 
							placeholder="회사전화"
								class="form-control" >

						</div>
					</div>
					<div class="form-group">
						<!-- 집전화-->
						<label class="control-label col-sm-2" for="phonehome">핸드폰번호</label>
						<div class="col-sm-5">
							<input type="text" id="phonecell" name="phonecell" 
							placeholder="핸드폰번호"
								class="form-control"  >

						</div>
					</div>
					<div class="form-group">
						<!-- 등급-->
						<label class="control-label col-sm-2" for="grade">이메일</label>
						<div class="col-sm-3">
							<input type="text" id="email" name="email" 
							placeholder="이메일"
								class="form-control"  >

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
			<div><a href="/examspring2/member/list">회원목록보기</a></div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#id").on("blur", function() {
				let id = $("#id").val();
				
				if(id.length >= 4) {
					let querydata = {"id": id};
				
					$.ajax({
						url: "/examspring2/member/idcheck",
						type: "post",
						data: querydata,
						dataType: "json",
						success: success_run, 
						error: error_run
					});
				} else if(id.length > 0 & id.length < 3) {
					fail_run();
				}
			});
		});
			
		function success_run(resp) {
			if (resp.check) {
                $("#checkId").html("사용불가능 ID");
                console.log(resp);
            } else {
                $("#checkId").html("사용가능 ID");
                console.log(resp);
            }
		}
		
		function error_run(obj, msg, statusMsg) {
			console.log("bad" + obj + ", " + msg + ", " + statusMsg);	
		}
		
		function fail_run() {
        	$("#checkId").html("4자 이상 입력해");
		}
	</script>
</body>
</html>