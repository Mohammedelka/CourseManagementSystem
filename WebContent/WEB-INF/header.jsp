
    

<style>
     <%@ include file="header.css"%>
</style>

    <nav>
        <div class="logo">
            <img  src="images/logo.png" alt="Logo Image">
        </div>
        <div class="hamburger">
            <div class="bars1"></div>
            <div class="bars2"></div>
            <div class="bars3"></div>
        </div>
        <ul class="nav-links">
            <li><a href="${pageContext.request.contextPath}/CourseAdd" > Add Course</a></li>
            <li><a href="${pageContext.request.contextPath}/CourseList">My courses</a></li>
            <li><a href="${pageContext.request.contextPath}/CourseUpdate">Update Course</a></li>
            <li><a href="${pageContext.request.contextPath}/MyAccount">My Account</a></li>
            <li><button class="login-button" href="#">Register</button></li>
            <li><button class="login-button" href="#">Sign In</button></li>
        </ul>
    </nav>
    <script>
        const hamburger = document.querySelector(".hamburger");
        const navLinks = document.querySelector(".nav-links");
        const links = document.querySelectorAll(".nav-links li");

        hamburger.addEventListener('click', () => {
            //Links
            navLinks.classList.toggle("open");
            links.forEach(link => {
                link.classList.toggle("fade");
            });

            //Animation
            hamburger.classList.toggle("toggle");
        });
    </script>
