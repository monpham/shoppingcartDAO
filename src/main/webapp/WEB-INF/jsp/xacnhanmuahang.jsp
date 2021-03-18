<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- Favicon -->
    <link rel="shortcut icon" href="/end/images/favicon.ico" type="image/x-icon" />
    <!-- Font Awesome -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
    />
    <!-- AOS -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.css"
    />
    <!-- Glidejs -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/css/glide.core.css"
    />
    <!-- Custom StyleSheet -->
    <link rel="stylesheet" href="/end/css/styles.css" />
    <title>Portfolio Website</title>
</head>
<body>
<!-- Header -->
<header id="home" class="header">
    <!-- Navigation -->
    <nav class="nav">
        <div class="navigation container">
            <div class="logo">
                <h1>PR32 IViettech<span>.</span></h1>
            </div>

            <div class="menu">
                <div class="top-nav">
                    <div class="logo">
                        <h1>PR32 IViettech<span>.</span></h1>
                    </div>
                    <div class="close">
                        <i class="fas fa-times"></i>
                    </div>
                </div>

                <ul class="nav-list">
                    <li class="nav-item">
                        <a href="/trangchu">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="#about" class="nav-link scroll-link">About</a>
                    </li>
                    <li class="nav-item">
                        <a href="#services" class="nav-link scroll-link">Services</a>
                    </li>
                    <li class="nav-item">
                        <a href="#skills" class="nav-link scroll-link">Skills</a>
                    </li>
                    <li class="nav-item">
                        <a href="#teams" class="nav-link scroll-link">Teams</a>
                    </li>

                </ul>
            </div>

            <div class="hamburger">
                <i class="fas fa-bars"></i>
            </div>
        </div>
    </nav>
    <!-- Hero -->
    <div class="hero">
        <h3>Bạn Đã Mua Hàng Thành Công</h3>
        <h1>BẠn Đã Mua Được Hàng </h1>
        <h1>I'm,Phạm Huỳnh Phú Quốc </h1>

        <h4>And I'm a <span id="type1"></span></h4>
        <a href="#">Hire me</a>
    </div>

    <img class="banner" src="/end/images/bg.png" alt="" />

    <div class="icons">
        <span><i class="fab fa-facebook-f"></i></span>
        <span><i class="fab fa-instagram"></i></span>
        <span><i class="fab fa-twitter"></i></span>
    </div>
</header>

<!-- Main -->
<section class="section about" id="about">
    <div class="title">
        <h1>About me</h1>
    </div>

    <div class="about-center container">
        <div class="left" data-aos="fade-right" data-aos-duration="2000">
            <img src="/end/images/mon.jpg" alt="" />
        </div>
        <div class="right" data-aos="fade-left" data-aos-duration="2000">
            <h1>I'm Phạm Huỳnh Phú Quốc  <span id="type2"></span></h1>
            <p>
               Em rất thích lập trình , đặc biệt là thích tìm và làm giao diện nó rất thú vị và vui
                giao diện là thứ mà khách hàng nhìn thấy đầu tiên , về chức năng em có thể làm chưa được tốt
                nhưng em sẽ cố gắn để có thể thành thạo và có được nhiều kinh nghiệm nhất về lập trình
                cảm ơn quý thầy cô thời gian qua đã dạy dỗ , em mong sớm được ra trường để đi làm và học hỏi thêm            </p>
            <a href="/end/js/Mẫu%20CV%20cổ%20điển_2.pdf" class="btn">Download CV</a>
        </div>
    </div>
</section>

<!-- Services -->
<section class="section theme" id="services">
    <div class="title">
        <h1>My Services</h1>
    </div>

    <div class="services-center container">
        <div class="service" data-aos="fade-down" data-aos-duration="2000">
            <span><i class="fab fa-accusoft"></i></span>
            <h2>Web Design</h2>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore
                exercitationem numquam porro asperiores neque architecto.
            </p>
        </div>

        <div class="service" data-aos="fade-up" data-aos-duration="2000">
            <span><i class="fas fa-chart-line"></i></span>
            <h2>Advertising</h2>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore
                exercitationem numquam porro asperiores neque architecto.
            </p>
        </div>

        <div class="service" data-aos="fade-down" data-aos-duration="2000">
            <span><i class="fas fa-blender-phone"></i></span>
            <h2>Apps Design</h2>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore
                exercitationem numquam porro asperiores neque architecto.
            </p>
        </div>
    </div>
</section>

<!-- Skills -->
<section class="section skills" id="skills">
    <div class="title">
        <h1>My Skills</h1>
    </div>

    <div class="skills-center container">
        <div class="skills-left" data-aos="fade-right" data-aos-duration="2000">
            <div class="skills-box">
                <h4>HTML5</h4>
                <div class="skills-ilt">
                    <div class="skills-bar html"></div>
                    <span>95%</span>
                </div>
            </div>
            <div class="skills-box">
                <h4>CSS</h4>
                <div class="skills-ilt">
                    <div class="skills-bar css"></div>
                    <span>85%</span>
                </div>
            </div>
            <div class="skills-box">
                <h4>JavaScript</h4>
                <div class="skills-ilt">
                    <div class="skills-bar javascript"></div>
                    <span>90%</span>
                </div>
            </div>
            <div class="skills-box">
                <h4>JAVA</h4>
                <div class="skills-ilt">
                    <div class="skills-bar nodejs"></div>
                    <span>80%</span>
                </div>
            </div>

            <div class="skills-box">
                <h4>MySQL</h4>
                <div class="skills-ilt">
                    <div class="skills-bar mongodb"></div>
                    <span>95%</span>
                </div>
            </div>
        </div>

        <div class="right" data-aos="fade-left" data-aos-duration="2000">
            <h3>My creative skills and experience</h3>
            <p>
                Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aperiam
                tempora distinctio sed. Animi, doloribus est. Suscipit praesentium
                tenetur libero eos! Suscipit voluptatem qui, nulla accusantium
                deleniti nam recusandae officiis possimus at voluptate cupiditate
                soluta nostrum deserunt consequuntur, ut quis eligendi? Quidem et
                doloremque cupiditate veniam optio corporis voluptatum, animi nemo!
            </p>
            <a href="#" class="btn">Read more</a>
        </div>
    </div>
</section>

<!-- Teams -->
<section class="section theme" id="teams">
    <div class="title">
        <h1>My teams</h1>
    </div>

    <div class="teams-center container">
        <div class="glide">
            <div class="glide__track" data-glide-el="track">
                <ul class="glide__slides">
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/end/images/dophuthien.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/end/images/nguyenduchoang.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/end/images/phamhuynhphuquoc.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/end/images/mon.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/end/images/phamhuynhphuquoc.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/end/images/phamhuynhphuquoc.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</section>


<footer>
    <p>Created By <span>Codevo</span> | &copy; 2020 All rights reserved.</p>
</footer>

<!-- AOS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.js"></script>
<!-- Typeit -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/typeit/7.0.4/typeit.min.js"></script>
<!-- GSAP -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>
<!-- Glidejs -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/glide.min.js"></script>
<!-- Custom Script -->
<script src="/end/js/index.js"></script>
</body>
</html>
