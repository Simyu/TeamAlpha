<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<link rel="stylesheet" media="screen" href="/assets/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" media="screen" href="/vassets/stylesheets/payment.css"/>
<script src="/assets/libs/jquery-1.10.2.min.js"></script>
</head>
<div id="payment">
<div class="header">
<strong>
</strong>
</div>
<div class="body">
<div class="content"></div>
<p>결제가 실패하였습니다.</p>
<p>결제일시: ${time}</p>
<p>상품명: 포인트 결제</p>
<div class="alert alert-warning">
다시 결제 해주시길 바랍니다.
</div>
</div>
<div class="footer">

<span id="closeBtn"></span>

</div>
</div>
<script type='text/javascript'>
  //<![CDATA[
    $(document).ready(function() {
        $(".btn-wrap").click(function() {
            self.close();
        });
    });
  //]]>
</script>


</html>
