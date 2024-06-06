<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="/examspring2/resources/static/common/css/main.css" />
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
    margin-bottom: 0;
    border-radius: 0;
}

</style>
<script type="text/javascript">
    $(document).ready(function() {
        $("#boardCategory>li").each(function() {
            $(this).click(function() {
                let category = $(this).text();
                let querydata = {"category": category};
                
                $("#boardCategory>li").removeClass("active");
                $(this).addClass("active");
                
                $.ajax({
                    url: "/examspring2/ajax/list",
                    type: "get",
                    data: querydata,
                    dataType: "json",
                    success: function(resp) {
                        $("#boardTable").empty();
                        
                        resp.forEach(function(board) {
                        	let date = new Date(board.write_date).toISOString().slice(0,10);
                            let row = 
                            	"<tr><td class='boardContent'>" + "<a href='/examspring2/board/read?board_no=" 
                        		+ board.board_no + "&action=READ'>" + board.title + "</a></td><td class='boardDate'>" 
                        		+ date + "</td></tr>";
                                
                            $("#boardTable").append(row);
                        });

                    }, 
                    error: function(obj, msg, statusMsg) {
                        console.log("bad" + obj + ", " + msg + ", " + statusMsg);  
                    }
                });
            });
        });
    });
</script>
<title>Insert title here</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-sm-7">
                <div id="myCarousel" class="carousel slide" data-ride="carousel"
                    style="width: 600px; height: 300px">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>

                    <!-- Wrapper for slides -->
                    <div class="carousel-inner" role="listbox">
                        <div class="item active">
                            <img src="/examspring2/images/playdata1.jpg" alt="Image"
                                style="width: 600px; height: 300px">

                        </div>

                        <div class="item">
                            <img src="/examspring2/images/playdata2.jpg" alt="Image"
                                style="width: 800px; height: 300px">

                        </div>
                        <div class="item">
                            <img src="/examspring2/images/playdata3.jpg" alt="Image"
                                style="width: 600px; height: 300px">

                        </div>


                    </div>

                    <!-- Left and right controls -->
                    <a class="left carousel-control" href="#myCarousel" role="button"
                        data-slide="prev"> <span
                        class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a> <a class="right carousel-control" href="#myCarousel" role="button"
                        data-slide="next"> <span
                        class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
            <div class="col-sm-5">
                <div class="panel panel-primary"
                    style="border-color: #edeef1; height: 300px; width: 450px">
                    <div class="panel-footer">사내소식</div>
                    <div class="panel-body">
                        <ul class="nav nav-tabs" id="boardCategory">
                            <li class="active"><a href="#">게시판</a></li>
                            <li><a href="#">사내소식</a></li>
                            <li><a href="#">경조사</a></li>
                        </ul>
                        <div id="boardMain" style="padding-top: 20px; padding-left: 10px">
                            <table id="boardTable">
								<c:forEach var="board" items="${boardlist}">
									<tr>
										<td class="boardContent" style="">
										<a href="/erp/board/read?board_no=${board.board_no}&action=READ">${board.title}</a>
										</td>
										<td class="boardDate" style="">${board.write_date}</td>
									</tr>
								</c:forEach>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <hr />
        <div class="row main-row">
            <div class="col-sm-3">
                <div class="panel panel-primary"
                    style="border-color: #edeef1; height: 300px">
                    <div class="panel-footer">News</div>
                    <div class="panel-body"></div>
                </div>
            </div>
            <div class="col-sm-3">
                <div class="panel panel-primary"
                    style="border-color: #edeef1; height: 300px">
                    <div class="panel-footer">회사소식</div>
                    <div class="panel-body"></div>
                </div>
            </div>
            <div class="col-sm-3">
                <div class="panel panel-primary"
                    style="border-color: #edeef1; height: 300px">
                    <div class="panel-footer">회사소식</div>
                    <div class="panel-body"></div>
                </div>
            </div>
            <div class="col-sm-3">
                <div class="panel panel-primary"
                    style="border-color: #edeef1; height: 300px">
                    <div class="panel-footer">회사소식</div>
                    <div class="panel-body"></div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
