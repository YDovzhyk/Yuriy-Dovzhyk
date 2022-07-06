<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>News Portal</title>
    <link rel="stylesheet" href="https://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
    <style>
      *{
        box-sizing: border-box;
      }
      #header{
        background-color: #2199e8;
      border-bottom: 1px solid gray;
        text-align: center;
      }
      #top_menu{
        display: inline-block;
        list-style: none;
        padding-left: 0;
        margin: 0;
        color: white;
      }
      #top_menu > li{
        display: inline-block;
        position: relative;
        color: white;
      }
      #top_menu > li > a{
        display: inline-block;
        padding: 10px 20px;
        color: inherit;
        text-decoration: none;
        transition: background-color 0.25s, color 0.15s;
      }
      #top_menu > li > a:hover{
        color: white;
        background-color: #2199c0;
      }
      #top_menu > li:hover > ul a{
        opacity: 1;
      }
      #top_menu > li:hover > ul li{
        height: 40px;
        opacity: 1;
      }
      .inner_menu{
        position: absolute;
        top: 100%;
        left: 0;
        list-style: none;
        padding-left: 0;
        text-align: left;
        white-space: nowrap;
        background-color: #2199e8;
      }
      .inner_menu > li{
        height: 0;
        opacity: 0;
        transition: height 0.3s, opacity 0.4s;
      }
      .inner_menu > li > a{
        width: 100%;
        display: inline-block;
        padding: 10px 20px;
        color: inherit;
        text-decoration: none;
        height: inherit;
        overflow: hidden;
        opacity: 0;
        transition: height 0.4s, opacity 0.5s;
      }
      .inner_menu > li > a:hover{
        color: white;
        background-color: #2199c0;
      }
      .top-bar input {
        width: 95px;
        height: 32px;
        margin-right: 1rem;
        background-color: #2199e8;
        border-width:1px;
        border-color: white;
        text-decoration-color: white;
        color: white;
        font-size: small;
      }
      .inp{
        display:  flex;
      }
    </style>
  </head>
  <body>

<!-- Navigation -->
<div class="title-bar" data-responsive-toggle="realEstateMenu" data-hide-for="small">
  <button class="menu-icon" type="button" data-toggle></button>
  <div class="title-bar-title">Menu</div>
</div>

<div class="top-bar" id="realEstateMenu">
  <div class="top-bar-left">
    <ul class="menu" data-responsive-menu="accordion">
      <li class="menu-text">Interplanetary</li>
      <li><a href="#">About</a></li>
      <li><a href="#">Contact us</a></li>
      <li><a href="#">Your idea</a></li>
      <li><a href="#">Feedback</a></li>
    </ul>
  </div>
  <div class="top-bar-right">
    <div class="inp">
    <form action="Controller" method="post">
      <input type="hidden" name="command" value="registration"/>
      <input type="submit" value="Registration" />
    </form>
    <form action="Controller" method="post">
      <input type="hidden" name="command" value="login"/>
      <input type="submit" value="Log in" />
    </form>
  </div>
  </div>
</div>
<!-- /Navigation -->

<br>

<div class="row">

  <div class="medium-4 large-5 columns">
    <h1>NEWS PORTAL</h1>
    <p class="subheader">Close Your Eyes and Open Your Mind</p>
    <button class="button">Take a Tour</button>
    <button class="button">Start a free trial</button>
  </div>

  <div class="show-for-large large-7 columns">
    <img src="https://servicepath.co/wp-content/uploads/2019/11/news.jpg">
  </div>

  <div class="row column">
    <br>
  </div>

  <div class="medium-4 large-12 columns">
    <div id="header">
      <ul id=top_menu>
        <li><a href="#">Main News</a></li>
        <li><a href="#">Sport</a>
          <ul class="inner_menu">
            <li><a href="#">Football</a></li>
            <li><a href="#">Formula 1</a></li>
            <li><a href="#">Box</a></li>
          </ul>
        </li>
        <li><a href="#">Tech</a>
          <ul class="inner_menu">
            <li><a href="#">PC & Laptops</a></li>
            <li><a href="#">PO & Developments</a></li>
            <li><a href="#">Smartphone</a></li>
          </ul>
        </li>
        <li><a href="#">Travel</a></li>
        <li><a href="#">Buy News Portal Pro</a></li>
      </ul>
    </div>
  </div>

</div>

<div class="row column">
  <hr>
</div>

<div class="row column">
  <p class="lead">Important WorldWide News</p>
</div>

<div class="row small-up-1 medium-up-2 large-up-3">
  <div class="column">
    <div class="callout">
      <p>Pegasi B</p>
      <p><img src="https://placehold.it/400x370&text=Pegasi B" alt="image of a planet called Pegasi B"></p>
      <p class="lead">Copernican Revolution caused an uproar</p>
      <p class="subheader">Find Earth-like planets life outside the Solar System</p>
    </div>
  </div>
  <div class="column">
    <div class="callout">
      <p>Pegasi B</p>
      <p><img src="https://placehold.it/400x370&text=Pegasi B" alt="image of a planet called Pegasi B"></p>
      <p class="lead">Copernican Revolution caused an uproar</p>
      <p class="subheader">Find Earth-like planets life outside the Solar System</p>
    </div>
  </div>
  <div class="column">
    <div class="callout">
      <p>Pegasi B</p>
      <p><img src="https://placehold.it/400x370&text=Pegasi B" alt="image of a planet called Pegasi B"></p>
      <p class="lead">Copernican Revolution caused an uproar</p>
      <p class="subheader">Find Earth-like planets life outside the Solar System</p>
    </div>
  </div>
  <div class="column">
    <div class="callout">
      <p>Pegasi B</p>
      <p><img src="https://placehold.it/400x370&text=Pegasi B" alt="image of a planet called Pegasi B"></p>
      <p class="lead">Copernican Revolution caused an uproar</p>
      <p class="subheader">Find Earth-like planets life outside the Solar System</p>
    </div>
  </div>
  <div class="column">
    <div class="callout">
      <p>Pegasi B</p>
      <p><img src="https://placehold.it/400x370&text=Pegasi B" alt="image of a planet called Pegasi B"></p>
      <p class="lead">Copernican Revolution caused an uproar</p>
      <p class="subheader">Find Earth-like planets life outside the Solar System</p>
    </div>
  </div>
  <div class="column">
    <div class="callout">
      <p>Pegasi B</p>
      <p><img src="https://placehold.it/400x370&text=Pegasi B" alt="image of a planet called Pegasi B"></p>
      <p class="lead">Copernican Revolution caused an uproar</p>
      <p class="subheader">Find Earth-like planets life outside the Solar System</p>
    </div>
  </div>

</div>

<div class="row column">
  <a class="button hollow expanded">Load More</a>
</div>

<footer>
  <div class="row expanded callout secondary">

    <div class="small-6 large-3 columns">
      <p class="lead">Offices</p>
      <ul class="menu vertical">
        <li><a href="#">One</a></li>
        <li><a href="#">Two</a></li>
        <li><a href="#">Three</a></li>
        <li><a href="#">Four</a></li>
      </ul>
    </div>

    <div class="small-6 large-3 columns">
      <p class="lead">Solar Systems</p>
      <ul class="menu vertical">
        <li><a href="#">One</a></li>
        <li><a href="#">Two</a></li>
        <li><a href="#">Three</a></li>
        <li><a href="#">Four</a></li>
      </ul>
    </div>

    <div class="small-6 large-3 columns">
      <p class="lead">Contact</p>
      <ul class="menu vertical">
        <li><a href="#"><i class="fi-social-twitter"></i> Twitter</a></li>
        <li><a href="#"><i class="fi-social-facebook"></i> Facebook</a></li>
        <li><a href="#"><i class="fi-social-instagram"></i> Instagram</a></li>
        <li><a href="#"><i class="fi-social-pinterest"></i> Pinterest</a></li>
      </ul>
    </div>

    <div class="small-6 large-3 columns">
      <p class="lead">Offices</p>
      <ul class="menu vertical">
        <li><a href="#">One</a></li>
        <li><a href="#">Two</a></li>
        <li><a href="#">Three</a></li>
        <li><a href="#">Four</a></li>
      </ul>
    </div>

  </div>
  <div class="row">

    <div class="medium-6 columns">
      <ul class="menu">
        <li><a href="#">Legal</a></li>
        <li><a href="#">Partner</a></li>
        <li><a href="#">Explore</a></li>
      </ul>
    </div>

    <div class="medium-6 columns">
      <ul class="menu float-right">
        <li class="menu-text">Copyright</li>
      </ul>
    </div>
  </div>

</footer>

    <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="https://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.js"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>
