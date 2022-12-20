
function resetFrombrand() {
    //$("#aoe").attr("disabled",true)
    var $vals=$("#addOrEditbrand input");
    $vals.each(function(){
        $(this).attr("style","").val("")
    });
}



function resetStyleBr() {
    //$("#aoe").attr("disabled",false)
    var $vals=$("#addOrEditbrand input");
    $vals.each(function(){
        $(this).attr("style","")
    });
}



//根据id查找品牌信息
function findByBrId(id,doname) {
    resetStyleBr()
    var url = getProjectPath()+"/brand/findByBrId?id=" + id;
    console.log("id:"+id);
    $.get(url, function (response) {
        //如果是编辑图书，将获取的图书信息回显到编辑的窗口中
        if(doname=='edit'){
            $("#ebid").val(response.data.brandId);
            $("#ebbrandName").val(response.data.brandName);
            $("#ebbrandPhone").val(response.data.brandPhone);
            $("#ebbrandDes").val(response.data.brandDes);    
        }
        
    })
}




//删除品牌
function deleteBrandById(id){
	var r = confirm("确定要删除品牌：" + id);
	if (r) {
        var url = getProjectPath() + "/brand/deleteById?id=" + id;
        $.get(url, function (response) {
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath() + "/brand/search";
            }
        })
    }
	
}



//品牌
function addOrEditbrand() {
    //获取表单中图书id的内容
    //.val()获取用户输入的值
    var ebid = $("#ebid").val();
    //如果表单中有图书id的内容，说明本次为编辑操作
    if (ebid > 0) {
        var url = getProjectPath()+"/brand/editBrand";
        $.post(url, $("#addOrEditbrand").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/brand/search";
            }
        })
    }
    //如果表单中没有图书id，说明本次为添加操作
    else {
        var url = getProjectPath()+"/brand/addbrand";
        console.log("url="+url);
        //.serialize()方法通过序列化表单值创建url编译文本字符串
        console.log($("#addOrEditbrand").serialize());
        $.post(url, $("#addOrEditbrand").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/brand/search";
            }
        })
    }
}








//重置添加和编辑窗口中输入框的内容
function resetFrom() {
    //$("#aoe").attr("disabled",true)
    var $vals=$("#addOrEditproduct input");
    $vals.each(function(){
        $(this).attr("style","").val("")
    });
}

//重置添加和编辑窗口中输入框的样式
function resetStyle() {
    //$("#aoe").attr("disabled",false)
    var $vals=$("#addOrEditproduct input");
    $vals.each(function(){
        $(this).attr("style","")
    });
}


//查询id对应的图书信息，并将图书信息回显到编辑或借阅的窗口中
function findproductById(id,doname) {
    resetStyle()
    var url = getProjectPath()+"/product/findById?id=" + id;
    $.get(url, function (response) {
        //如果是编辑图书，将获取的图书信息回显到编辑的窗口中
        if(doname=='edit'){
            $("#ebid").val(response.data.productId);
            $("#ebname").val(response.data.productName);
            $("#ebprice").val(response.data.productPrice);
            $("#ebstatus").val(response.data.productNum);    
        }
        
    })
}


//删除产品
function deleteProductById(id){
	var r = confirm("确定要删除菜品：" + id);
	if (r) {
        var url = getProjectPath() + "/product/delproduct?id=" + id;
        $.get(url, function (response) {
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath() + "/product/search";
            }
        })
    }
}


//点击添加或编辑的窗口的确定按钮时，提交图书信息
function addOrEdit() {
    //获取表单中图书id的内容
    //.val()获取用户输入的值
    var ebid = $("#ebid").val();
    //如果表单中有图书id的内容，说明本次为编辑操作
    if (ebid > 0) {
        var url = getProjectPath()+"/product/editproduct";
        $.post(url, $("#addOrEditproduct").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/product/search";
            }
        })
    }
    //如果表单中没有图书id，说明本次为添加操作
    else {
        var url = getProjectPath()+"/product/addproduct";
        console.log("url="+url);
        //.serialize()方法通过序列化表单值创建url编译文本字符串
        console.log($("#addOrEditproduct").serialize());
        $.post(url, $("#addOrEditproduct").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/product/search";
            }
        })
    }
}


//重置添加和编辑窗口中输入框的内容
function resetWorkerFrom() {
    //$("#aoe").attr("disabled",true)
    var $vals=$("#addOrEditWorker input");
    $vals.each(function(){
        $(this).attr("style","").val("")
    });
}

//重置添加和编辑窗口中输入框的样式
function resetStyleWr() {
    //$("#aoe").attr("disabled",false)
    var $vals=$("#addOrEditWorker input");
    $vals.each(function(){
        $(this).attr("style","")
    });
}

//根据id查找员工信息
function findworkerById(id,doname) {
    resetStyleWr()
    var url = getProjectPath()+"/worker/findworkerById?id=" + id;
    $.get(url, function (response) {
        //如果是编辑图书，将获取的图书信息回显到编辑的窗口中
        if(doname=='editworker'){
            $("#workerid").val(response.data.workerId);
            $("#workername").val(response.data.workerName);
            $("#workerage").val(response.data.workerAge);
            $("#workersex").val(response.data.wokerSex);  
            $("#workerwage").val(response.data.workerWage);    
        }
        
    })
}


//删除员工
function deleteworkerById(id){
	var r = confirm("确定要删除这名员工：" +id);
	if (r) {
        var url = getProjectPath() + "/worker/delworker?id=" + id;
        console.log(url);
        $.get(url, function (response) {
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath() + "/worker/search";
            }
        })
    }
	
}


//添加或修改员工信息
function saveWorker() {
    //获取表单中图书id的内容
    //.val()获取用户输入的值
    var workerid = $("#workerid").val();
    //如果表单中有图书id的内容，说明本次为编辑操作
    if (workerid > 0) {
        var url = getProjectPath()+"/worker/editWorker";
        $.post(url, $("#addOrEditWorker").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/worker/search";
            }
        })
    }
    //如果表单中没有图书id，说明本次为添加操作
    else {
        var url = getProjectPath()+"/worker/addWorker";
        console.log("url="+url);
        //.serialize()方法通过序列化表单值创建url编译文本字符串
        console.log($("#addOrEditWorker").serialize());
        $.post(url, $("#addOrEditWorker").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/worker/search";
            }
        })
    }
}


//删除分类
function deletecategoryById(id){
	var r = confirm("确定要删除：" );
	if (r) {
        var url = getProjectPath() + "/category/delcategory?id=" + id;
        $.get(url, function (response) {
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath() + "/category/search";
            }
        })
    }
	
}


//分类
//重置添加和编辑窗口中输入框的内容
function resetCategoryFrom() {
    //$("#aoe").attr("disabled",true)
    var $vals=$("#addOrEditcategory input");
    $vals.each(function(){
        $(this).attr("style","").val("")
    });
}
//重置添加和编辑窗口中输入框的样式
function resetStyle() {
    //$("#aoe").attr("disabled",false)
    var $vals=$("#addOrEditcategory input");
    $vals.each(function(){
        $(this).attr("style","")
    });
}
//查询id对应的图书信息，并将图书信息回显到编辑或借阅的窗口中
function findcategoryById(id,doname) {
    resetStyle()
    var url = getProjectPath()+"/category/findById?id=" + id;
    $.get(url, function (response) {
        //如果是编辑图书，将获取的图书信息回显到编辑的窗口中
        if(doname=='edit'){
            $("#ebid").val(response.data.categoryId);
            $("#ebname").val(response.data.categoryName);
            $("#ebprice").val(response.data.categoryName);
            $("#ebstatus").val(response.data.categoryNum);    
        }
        
    })
}
//点击添加或编辑的窗口的确定按钮时，提交图书信息
function categoryaddOrEdit() {
    //获取表单中图书id的内容
    var ebid = $("#ebid").val();
    //如果表单中有图书id的内容，说明本次为编辑操作
    if (ebid > 0) {
        var url = getProjectPath()+"/category/editcategory";
        $.post(url, $("#addOrEditcategory").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/category/search";
            }
        })
    }
    //如果表单中没有图书id，说明本次为添加操作
    else {
        var url = getProjectPath()+"/category/addcategory";
        console.log("url="+url);
        console.log($("#addOrEditcategory").serialize());
        $.post(url, $("#addOrEditcategory").serialize(), function (response) {
        	console.log(response);
            alert(response.message)
            if (response.success == true) {
                window.location.href = getProjectPath()+"/category/search";
            }
        })
    }
}



















//检查图书信息的窗口中，图书信息填写是否完整
function checkval(){
    var $inputs=$("#addOrEditTab input")
    var count=0;
    $inputs.each(function () {
        if($(this).val()==''||$(this).val()=="不能为空！"){
            count+=1;
        }
    })
    //如果全部输入框都填写完整，解除确认按钮的禁用状态
    if(count==0){
        //$("#aoe").attr("disabled",false)
    }
}
//页面加载完成后，给图书模态窗口的输入框绑定失去焦点和获取焦点事件


//重置添加和编辑窗口中输入框的内容
function resetUserFrom() {
    $("#savemsg").attr("disabled",true)
    $("#addmsg").html("")
    var $vals=$("#addUer input");
    $vals.each(function(){
        $(this).attr("style","").val("")
    });

}


//获取当前项目的名称
    function getProjectPath() {
        //获取主机地址之后的目录，如： cloudlibrary/admin/products.jsp
        var pathName = window.document.location.pathname;
        //获取带"/"的项目名，如：/cloudlibrary
        var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
        return projectName;
    }

    /**
     * 数据展示页面分页插件的参数
     * cur 当前页
     * total 总页数
     * len   显示多少页数
     * pagesize 1页显示多少条数据
     * gourl 页码变化时 跳转的路径
     * targetId 分页插件作用的id
     */
    var pageargs = {
        cur: 1,
        total: 0,
        len: 5,
        pagesize: 10,
        gourl: "",
        targetId: 'pagination',
        callback: function (total) {
            var oPages = document.getElementsByClassName('page-index');
            for (var i = 0; i < oPages.length; i++) {
                oPages[i].onclick = function () {
               //自定义的方法
                    changePage(this.getAttribute('data-index'), pageargs.pagesize);
                }
            }
            var goPage = document.getElementById('go-search');
            goPage.onclick = function () {
                var index = document.getElementById('yeshu').value;
                if (!index || (+index > total) || (+index < 1)) {
                    return;
                }
                changePage(index, pageargs.pagesize);
            }
        }
    }
    /**
     *图书查询栏的查询参数
     * name 图书名称
     * author 图书作者
     * press 图书出版社
     */
    var productVO = {
        productName: '',
        productPrice: '',
        productNum: ''
    }
    /**
     *借阅记录查询栏的查询参数
     * name 图书名称
     * borrower 借阅人
     */
    var brandVO = {
        brandName: '',
        brandAddress: '',
        brandPhone:''
    }
    
    var userVO = {
        id: '',
        name: ''
    }
    
    var workerVo = {
    	workerName:'',
    	workerAge:'',
    	wokerSex:''
    }
    
    //用户评论
      var commentVo = {
    	commandUsername:'',
    	commentContent:'',
    	
    }
    
     var categoryVo = {
    	categoryName:'',
    	categoryNum:'',
    }

//数据展示页面分页插件的页码发送变化时执行
    function changePage(pageNo, pageSize) {
        pageargs.cur = pageNo;
        pageargs.pagesize = pageSize;
        document.write("<form action=" + pageargs.gourl + " method=post name=form1 style='display:none'>");
        document.write("<input type=hidden name='pageNum' value=" + pageargs.cur + " >");
        document.write("<input type=hidden name='pageSize' value=" + pageargs.pagesize + " >");
        //如果跳转的是图书信息查询的相关链接，提交图书查询栏中的参数
        if (pageargs.gourl.indexOf("product") >= 0) {
            document.write("<input type=hidden name='productName' value=" + productVO.productName + " >");   
        }//跳转到员工页面
        if (pageargs.gourl.indexOf("worker") >= 0) {
            document.write("<input type=hidden name='workerName' value=" + workerVo.workerName + " >");
            document.write("<input type=hidden name='workerAge' value=" + workerVo.workerAge + " >");
            document.write("<input type=hidden name='wokerSex' value=" + workerVo.wokerSex + " >");
        }
        //跳转到品牌
        if (pageargs.gourl.indexOf("brand") >= 0) {
            document.write("<input type=hidden name='brandName' value=" + brandVO.brandName + " >");
            document.write("<input type=hidden name='brandAddress' value=" + brandVO.brandAddress + " >");
            document.write("<input type=hidden name='brandPhone' value=" + brandVO.brandPhone + " >");
        }
        //跳转到用户评论
        if (pageargs.gourl.indexOf("comment") >= 0) {
            document.write("<input type=hidden name='commandUsername' value=" + commentVo.commandUsername + " >");
            document.write("<input type=hidden name='commentContent' value=" + commentVo.commentContent + " >");
        }
        //如果跳转的是图书记录查询的相关链接，提交图书记录查询栏中的参数
        if (pageargs.gourl.indexOf("user") >= 0) {
            document.write("<input type=hidden name='id' value=" + userVO.id + " >");
            document.write("<input type=hidden name='name' value=" + userVO.name + " >");
        }
           //跳转到分类
        if (pageargs.gourl.indexOf("category") >= 0) {
            document.write("<input type=hidden name='categoryName' value=" + categoryVo.categoryName + " >");
            document.write("<input type=hidden name='categoryNum' value=" + categoryVo.categoryNum + " >");
            
        }
      
        document.write("</form>");
        document.form1.submit();
        pagination(pageargs);
    }


