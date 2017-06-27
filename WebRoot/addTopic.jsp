<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">

<head>
<title>Kids Care a Society and People Category Bootstrap
	Responsive website Template | Contact :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Kids Care Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript">
	
	
			addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);

			function hideURLbar() { window.scrollTo(0, 1); }
		

</script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<!-- //Custom Theme files -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- //font-awesome icons -->
<!-- js -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- //js -->
<!-- web-fonts -->
<link href="//fonts.googleapis.com/css?family=Parisienne"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Yanone+Kaffeesatz:200,300,400,700"
	rel="stylesheet">
<link
	href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>
<!-- //web-fonts -->


<!--编辑器基本配置-->

<script type="text/javascript" charset="utf-8" src="ueditor/ueditor.config.js"></script>

<!--编辑器完整代码-->

<script type="text/javascript" charset="utf-8" src="ueditor/ueditor.all.js">
	
</script>
</head>

<body>
	<!-- header -->
	<div class="headerw3l">
		<nav class="navbar navbar-default">
			<div class="container">
				<div class="navbar-header navbar-left">
					<h1>
						<a href="index.html">Kids Care <span><i>Learn.</i> <i
								class="logo-w3l2">Share.</i> <i class="logo-w3l3"> Laugh.</i> <i
								class="logo-w3l4"> Grow.</i></span></a>
					</h1>
				</div>
				<!-- navigation -->
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-right"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-left">
						<li class="active"><a href="index.jsp"
							class="link link--yaku"><span>首页</span></a></li>
						<li><a href="luntan.jsp" class="link link--yaku"><span>论坛</span></a>
						</li>
						<li><a href="login.jsp" class="link link--yaku"><span>登录</span></a>
						</li>
						<li><a href="signin.jsp" class="link link--yaku"><span>注册</span></a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<!-- //header -->
	<!-- banner -->
	<div class="banner about-w3banner">
		<div class="banner-img1">
			<div class="banner-w3text">
				<h2>Professional Kids Care Center</h2>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- contact -->
	<div class="contact w3-agileits">
		<div class="container" style="text-align:center">
			<h3 class="agileits-title1">Information</h3>
			<div class="contact-w3lsrow">
				<div class="col-md-6">
					<form action="<%=path %>/servlet/AddTopicServlet" method="post">
						<input type="text" name="title" placeholder="Title" required>
						<input type="text" name="email" placeholder="E-mail" required>
						<input type="text" name="phone" placeholder="PhoneNumber" required>
						<div>

							<script id="editor" name="content" type="text/plain"></script>

						</div>

						<script type="text/javascript">
							//实例化编辑器

							var ue = UE.getEditor('editor', {

								autoHeightEnabled : true,

								autoFloatEnabled : true,

								initialFrameWidth : 996,

								initialFrameHeight : 483

							});
						</script>
						<input type="submit" value="submit">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
			<!-- address -->

			<!-- //address -->
		</div>
	</div>
	<!-- //contact -->
	<!-- footer -->
	<div class="footer w3layouts">
		<div class="container">
			<div class="footer-agileinfo">

				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<div class="copy-right w3-agileits">
		<div class="container">

			<p>©</p>

			<p>
				are . All 2017 Kids Crights reserved | Design by <a
					href="http://w3layouts.com"> W3layouts.</a>
			</p>
		</div>
	</div>
	<!-- //footer -->
	<!-- start-smooth-scrolling -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();

				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- //end-smooth-scrolling -->
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/bootstrap.js"></script>
</body>

</html>