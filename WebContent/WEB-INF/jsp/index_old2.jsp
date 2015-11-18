<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/commons/tag.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head lang="en">
<title>首页</title>
<meta charset="utf-8">
<meta name=”viewport” content=”width=device-width, initial-scale=1″ />
<link href="/css/commons.css" rel="stylesheet" type="text/css" />
<link href="/css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/js/commons.js"></script>
<script type="text/javascript" src="/js/index.js"></script>
<script type="text/javascript" src="/js/jquery/jquery-1.7.2.js"></script>

</head>
<body>
	<!-- 头部 -->
	<header>
		<p>这是一个header标签</p>
		<nav>
			<ul>
				<li>首页</li>
				<li>论坛</li>
				<li>商城</li>
				<li>社区</li>
				<li>关于</li>
			</ul>

		</nav>
	</header>

	<!-- 主体 -->
	<div>
		<section>
			<p>这是一个section标签</p>
			<article>
				<h3>春晓</h3>
				<p>
					春眠不觉晓,<br> 处处蚊子咬,<br> 打赏敌敌畏,<br> 不知死多少.<br>
				</p>
			</article>
			<hr />

			<article>
				<h3>上学歌</h3>
				<p>
					太阳当空照,<br> 花儿对我笑,<br> 小鸟说,早早早,<br> 你为什么背上小书包.<br>
					<br> 我去上学校,<br> 天天不迟到,<br> 爱学习,爱劳动,<br>
					长大要为人民立功劳.<br>
				</p>

			</article>
			<hr>
			<figure>
				<figcaption>UFO</figcaption>
				<p>不明飞行物 Unknown flying Object</p>

			</figure>
			<figure>
				<dt>DAO</dt>
				<dd>工厂类</dd>
			</figure>
			<hr>
			<dialog>
			<dt>唐僧说:悟空你又调皮了!观音姐姐的月光宝盒怎么能乱扔呢?</dt>
			<dd>悟空说:你个老不死的,烦死了!块闭嘴吧</dd>
			<dt>唐僧说:你这个死猴子,真没教养!怎么跟师傅说话的?</dt>
			<dd>悟空说:小瘪三,老子五百年前就大闹天宫了,那时候你爷爷的爷爷的爷爷的祖宗还在尿裤子呢!</dd>
			</dialog>
			<hr>
			<menu>
				<li>点击</li>
				<li>右键单击</li>
			</menu>
			<hr>
			<span contextmenu="candan">右键点击我试试</span>
			<menu type="context" id="candan">
				<menuitem label="菜单1" onclick="alert('菜单1');"></menuitem>
			</menu>
			<hr>
			<meter min="0" max="10" value="6" low="3" high="8"></meter>
			<progress max="100" value="1" id="pro"></progress>
			<script>
				var pro = document.getElementById("pro");

				setInterval(function() {
					pro.value += 2;
				}, 100);
			</script>

			<br>
			<details>
				<dt>这是一个问题</dt>
				<dd>to be or not to be</dd>
				<dt>这是一个问题</dt>
				<dd>to be or not to be</dd>
			</details>

			<hr>
			<ruby>
				<rp>(</rp>
				犇
				<rp>)</rp>
				<rt>ben</rt>
			</ruby>

			<hr />
			<mark> 女人最喜欢做的事情 </mark>
			就是逛街....吃零食.....逛街...吃零食,偶尔还会噢噢的哭.于是总结了下女人:逛吃逛吃逛吃...呜呜呜
		</section>

		<!--侧边栏-->
		<aside>
			<p>这是一个aside标签</p>
			<hgroup>
				<h3>女生宿舍为何频频被盗</h3>
				<h3>200头母猪为何半夜惨叫</h3>
				<h3>是人性的扭曲</h3>
				<h3>还是道德的沦丧</h3>

			</hgroup>

		</aside>

	</div>

	<!-- 底部 -->
	<footer>
		<p>这是一个footer标签</p>
		<hr>
		<small>法律条文</small> <small>联系我们</small> <small>加入我们</small> <small><i>加入我们</i></small>
	</footer>

</body>
</html>
