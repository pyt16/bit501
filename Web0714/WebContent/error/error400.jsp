<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/include.jspf" %>

<style>
textarea { resize:none; height:200px; font-size:32pt; font-family:comic Sans MS; }
</style>

<div class="container">

	<form class="form-horizontal" id="form1">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h2 class="text-center">
				에러페이지
				</h2>
			</div>
			<div class="panel-body">
				<div class="form-group">
					<label class="control-label col-sm-2">에러코드</label>
					<div class="col-sm-10">
						<textarea class="form-control" name="errorParam" rows="10" readonly>
						HTTP상태코드 : 400에러결과
						요청한 페이지를 찾을 수 없습니다.
						index.jsp문서  시작하세요.
						</textarea>
						<div align="center"> <img src="common/error2.gif"> </div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>