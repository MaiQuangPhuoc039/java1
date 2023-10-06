const btn = document.querySelectorAll("button")

btn.forEach(function(button,index){
button.addEventListener("click", function(event){{
    var btnItem = event.target
    var product = btnItem.parentElement
   
    var productName = product.querySelector(".tensp").innerText
    var productImg  = product.querySelector("img").src
    var productPrice = product.querySelector(".gia p").innerText
    // console.log(productImg,productName,productPrice)
    addcart(productPrice,productImg,productName)
}})
})

function  addcart(productPrice,productImg,productName){
    var addtr = document.createElement("tr")
    var cartItem = document.querySelectorAll("tbody tr")
    count =1;
    // kiem tra xem  san pham co trung nhau kh ?
    for (var i=0; i<cartItem.length; i++){
      
        var productT = document.querySelectorAll(".title")
        count ++;
        document.getElementById("count").innerHTML  =  count;
        if (productT[i].innerHTML==productName){
          window.alert(" sản phẩm này đã có trong giỏ hàng , bạn có thể thay đổi số lượng sản phẩm này trong giỏ hàng nhé !!!");
          // neu hai ten san phan giong nhau
        // alert(" sản phẩm của bạn đã có trong gio hàng , bạn có thể thay đổi số lượng sản phẩm này trong giỏ hàng !!!")
        return 
         }
    }
    var trcontent = '<tr style="border-bottom:2px solid gray;"><td style="display: flex; align-items: center;font-weight: bold; text-align: center;"><img src="'+productImg+'" alt="">&emsp;<span class="title">'+productName+'</span> </td><td>  <p><span class="price">'+productPrice+ '</span>&nbsp;<u>đ</u></p></td><td><input type="number" style="width: 40px;border-radius:5px" value="1" min="1"></td><td style="cursor: pointer; ">  <i  class="fa-regular fa-trash-can"></i>  <span class="cart-delete">xóa</span></td></tr>'
    addtr.innerHTML = trcontent
    var cartTable = document.querySelector("tbody")
    cartTable.append(addtr)
    cartotal()
    deleteCart()
}

  // ------------------------------------totalPrice

function cartotal(){
    var cartItem = document.querySelectorAll("tbody tr")   //cac sp trong gio hang
    var totalC = 0
    // console.log(cartItem.length)
    for (var i=0; i<cartItem.length; i++){
        var inputValue = cartItem[i].querySelector("input").value  // .value lay gia tri value
      
        // console.log(inputValue)
        // gia
        var  productPrice = cartItem[i].querySelector(".price").innerHTML // .innerhtml lay class price trong html
        // console.log(productPrice)
        totalA = inputValue*productPrice*1000   // *1000
        
        // console.log(tatalB)
        totalC = totalC + totalA // C là tổng tiền và ta đang sử dụng vòng lặp
        // totalD = totalC.toLocaleString('de-DE')    // tao . giua 000000-> 000.000

    }
    //  end for
    var cartTotalA = document.querySelector(".price-total span")
    cartTotalA.innerHTML = totalC.toLocaleString('de-DE')
    inputchange()
    // console.log(cartTotalA)
}

// -----------------------DELET CART --------------------
function deleteCart(){
    var cartItem = document.querySelectorAll("tbody tr")   //cac sp trong gio hang
    var  count = cartItem.length;
    for (var i=0; i<cartItem.length; i++){

        var productT = document.querySelectorAll(".cart-delete")
        productT[i].addEventListener("click",function(event){
          var cartDelete = event.target
          var cartitemR = cartDelete.parentElement.parentElement  // 2paren vi : paren -> td -> tr
          cartitemR.remove()
          
          count--;
          document.getElementById("count").innerHTML = count;
          cartotal()
        })
      // console.log(productT)
    }
}

function inputchange(){
  var cartItem = document.querySelectorAll("tbody tr")   //cac sp trong gio hang
  for (var i=0; i<cartItem.length; i++){
      var inputValue = cartItem[i].querySelector("input")
      inputValue.addEventListener("change",function(){
        cartotal()
      })
  }
}

const cartbtn = document.querySelector("#mark")
const cartshow = document.querySelector(".fa-bag-shopping")
const menuShow = document.querySelector("#bras")
const menuoff = document.querySelector("#out")
cartshow.addEventListener("click",function(){
  document.querySelector(".cart").style.left= "0"
})
cartbtn.addEventListener("click",function(){
  document.querySelector(".cart").style.left= "-100%"
})
menuShow.addEventListener("click",function(){
  document.querySelector(".menu").style.left = "0"
})
menuoff.addEventListener("click",function(){
  document.querySelector(".menu").style.left = "-100%"
})
