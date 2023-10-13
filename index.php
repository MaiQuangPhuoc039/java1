<?php require_once 'conn.php' ?>
<?php

if(!isset($idloaisanpham)){
    $idloaisanpham = filter_input(INPUT_GET, 'idloaisanpham', FILTER_VALIDATE_INT);
    if($idloaisanpham == NULL || $idloaisanpham  == FALSE){
        $idloaisanpham = 1;
    }
}

$queryloaisanpham = $conn->query("SELECT * FROM loaisanpham");

$result = $conn->query("SELECT * FROM sanpham
                               WHERE idloaisanpham = $idloaisanpham");

$queryidloaisanpham = $conn->query("SELECT * FROM loaisanpham
WHERE idloaisanpham = $idloaisanpham");



?>                      

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/app1.css">
    <link rel="stylesheet" href=" https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <title>Document</title>
</head>

<body>
    <div id="wrapper">

        <div id="header">
            <nav class="container">
                <a href="" id="logo">
                    <img src="images/logo.png" alt="">
                </a>

                <ul id="main-menu">
                    <li><a href="">TRANG CHỦ</a></li>
                    <li><a href="">SẢN PHẨM</a>
                        <ul class="sub-menu">



                            <?php while ($row1 = mysqli_fetch_assoc($queryloaisanpham)) : ?>
                                <?php $tenloaisanpham = $row1['tenloaisanpham'];
                                      $idloaisanpham = $row1['idloaisanpham'];
                                ?>

                                <li>
                                    <?php // hiem thi menu cac loai san pham  ?>
                                    <a href=".?idloaisanpham=<?php echo $idloaisanpham; ?>">
                                        <?php echo $row1['tenloaisanpham'] ?>
                                    </a>

                                    <ul class="sub-menu">
                                        <?php $queryCategory = $conn->query("SELECT * FROM sanpham
                                        WHERE idloaisanpham =  $idloaisanpham ");  ?>

                                        <?php while ($row = mysqli_fetch_assoc($queryCategory)) : ?>

                                            <li>
                                                <a href="">
                                                    <?php echo $row['tensp'] ?>
                                                </a>
                                            </li>
                                        <?php endwhile; ?>
                                    </ul>
                                </li>
                            <?php endwhile; ?>
                        </ul>
                    </li>





                    </li>
                    <li><a href="">TIN TỨC</a></li>
                    <li><a href="">VIDEO</a></li>
                    <li><a href="">HỖ TRỢ</a></li>
                    <li><a href="">GIỎ HÀNG</a></li>
                    <li><a href="">ĐĂNG NHẬP</a></li>
                    <li><a href="">ĐĂNG KÝ</a></li>
                </ul>
            </nav>
        </div>

        <div id="main">
            <aside>

            </aside>

            <section>

                <div id="products">

                <?php while($row = mysqli_fetch_assoc($queryidloaisanpham)): ?>

                <?php endwhile ;?>
                                            
                 <?php while ($row = mysqli_fetch_assoc($result)) : ?>
                    <div id="product_item">
                        <img src="images/<?php echo $row['hinhanh']; ?>" alt="mu1">
                        <div class="infor">
                            <p class="nameproduct"><?php echo $row['tensp']; ?></p><br>
                            <p class="price"><?php echo $row['giasp']?><span>VND</span></p>    
                        </div>
                    </div>
                    <?php endwhile; ?>

                    
                </div>

            </section>
        </div>

        <div id="footer">
            <div class="lienhe">
                <div id="chat1" class="chat">
                    <p class="chatitem">Trung tâm hỗ trợ</p>
                    <ul>
                        <li>Tư vấn mua hàng</li>
                        <li>Hỗ trợ hệ thống</li>
                        <li>Tài khoản và đăng nhập</li>
                        <li class="dt"> <i style="color: rgb(255, 0, 0);" class="fa fa-phone"></i> <span>Toàn quốc</span></li>
                        <li style="color: black; font-weight: bold;" class="sdt">Bảo hành : <span>0905345876</span></li>
                        <li style="color: red; font-weight: bold;" class="sdt">HOTLINE&nbsp; <span style="color:black">:</span> <span>0779565344</span></li>
                    </ul>
                </div>

                <div class="chat">
                    <p class="chatitem">Hỗ trợ khách hàng</p>
                    <ul>
                        <li>Hướng dẫn mua hàng</li>
                        <li>Tư vấn hoàn trả</li>
                        <li>chính sách và quy định chung</li>
                        <li>Chính sách bảo mật</li>
                        <li>Chính sách đảm bảo về chất lượng sản phẩm</li>
                        <li>Chính sách bảo hành</li>
                        <li>Chính sách vận chuyển-nhận hàng</li>
                    </ul>
                </div>
                <div id="app" class="chat">
                    <p class="chatitem">Thông tin liên hệ </p>
                    <ul>
                        <li class="mxh"><img src="https://bizweb.dktcdn.net/100/350/142/themes/902025/assets/facebook-icon-32x32.png?1683993338637" alt="">
                            <p>Facebook</p>
                        </li>
                        <li class="mxh"><img src="https://bizweb.dktcdn.net/100/350/142/themes/902025/assets/instagram_32x32.png?1683993338637" alt="">
                            <p>Intagram</p>
                        </li>
                        <li class="mxh"><img src="https://bizweb.dktcdn.net/100/350/142/themes/902025/assets/tiktok-icon-32x32.png?1683993338637" alt="">
                            <p>TikTok</p>
                        </li>
                        <li class="mxh"><img src="https://tse3.mm.bing.net/th?id=OIP.vpx0C7O7lufiaNqp5toPAQHaHa&pid=Api&P=0&h=180" alt="">
                            <p>Twitter</p>
                        </li>
                    </ul>
                </div>
            </div>
        </div>



    </div>

    <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
    <script>
        $(document).ready(function() {
            $('.sub-menu').parent('li').addClass('has-child');
        });
    </script>

</body>

</html>