<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY Project</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<link rel="stylesheet" type="text/css" href="css.css">
<body>
	<!-- 상단 네비 -->
	<jsp:include page="topnav.jsp" />
	
	<!-- 회원 가입 -->
	<div class="container">
		<div class="page-header">
			<div class="col-md-6 col-md-offset-3">
				<h3>회원가입</h3>
			</div>
		</div>
		<div class="col-sm-6 col-md-offset-3">
			<form role="form" method="POST" action="/SafeFoodJava_Seoul_02_JeonWooHyung_BanTaeHyeong/signup">
				<div class="form-group">
					<label for="inputName">성명</label> <input type="text"
						class="form-control" id="inputName" name="name" placeholder="이름을 입력해 주세요">
				</div>
				<div class="form-group">
					<label for="InputEmail">이메일 주소</label> <input type="email"
						class="form-control" id="InputEmail" name="email" placeholder="이메일 주소를 입력해주세요">
				</div>
				<div class="form-group">
					<label for="inputPassword">비밀번호</label> <input type="password"
						class="form-control" id="inputPassword" name="pw" placeholder="비밀번호를 입력해주세요">
				</div>
				<div class="form-group">
					<label for="inputPasswordCheck">비밀번호 확인</label> <input
						type="password" class="form-control" id="inputPasswordCheck"
						placeholder="비밀번호 확인을 위해 다시한번 입력 해 주세요">
				</div>
				<div class="form-group">
					<label for="inputMobile">휴대폰 번호</label> <input type="tel"
						class="form-control" id="inputMobile" placeholder="휴대폰번호를 입력해 주세요">
				</div>
				<div class="form-group">
					<fieldset class="al">
						<label for="inputMobile">알레르기</label>
						<div class="checkbox">
							<label><input type="checkbox" value="">대두</label> <label><input
								type="checkbox" value="">땅콩</label> <label><input
								type="checkbox" value="">우유</label> <label><input
								type="checkbox" value="">게</label>
						</div>
						<div class="checkbox disabled">
							<label><input type="checkbox" value="">새우</label> <label><input
								type="checkbox" value="">참치</label> <label><input
								type="checkbox" value="">연어</label> <label><input
								type="checkbox" value="">쑥</label>
						</div>

					</fieldset>
				</div>
	
				<div class="form-group">
					<label>약관 동의</label>
					<div data-toggle="buttons">
						<label class="btn btn-primary active"> <span
							class="fa fa-check"></span> <input id="agree" type="checkbox"
							autocomplete="off" checked>
						</label> <a href="#">이용약관</a>에 동의합니다.
					</div>
				</div>
	
				<div class="form-group text-center">
					<button type="submit" id="join-submit" class="btn btn-primary">
						회원가입<i class="fa fa-check spaceLeft"></i>
					</button>
					<button type="submit" class="btn btn-warning">
						가입취소<i class="fa fa-times spaceLeft"></i>
					</button>
				</div>
			</form>
		</div>
	</div>

	<!-- 하단 바  -->
	<jsp:include page="bottombar.jsp" />

</body>
</html>