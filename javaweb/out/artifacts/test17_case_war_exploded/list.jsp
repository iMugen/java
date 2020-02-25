<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <script>
        function delUser(id) {
            //判断用户操作
            if (confirm("不要啊，爸爸！！！")) {
                location.href = "${pageContext.request.contextPath}/delUserServlet?id=" + id;
            }
        }

        window.onload = function () {
            document.getElementById("delSelected").onclick = function () {
                if (confirm("全TM删了吧，傻逼！")) {
                    var flag = false;
                    var cbs = document.getElementsByName("uid");
                    for (var i = 0; i < cbs.length; i++) {
                        if (cbs[i].checked) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        //表单提交
                        document.getElementById("form").submit();
                    }

                    /*var flag = false;
                    //判断是否有选中条目
                    var cbs = document.getElementsByName("uid");
                    for (var i = 0; i < cbs.length; i++) {
                        if (cbs[i].checked) {
                            //有一个条目选中了
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {//有条目被选中
                        //表单提交
                        document.getElementById("form").submit();
                    }*/
                }
            };

            //全选
            //1.获取一个个cb
            document.getElementById("firstCb").onclick = function () {
                //2.获取下面所有的cb
                var cbs = document.getElementsByName("uid");
                for (var i = 0; i < cbs.length; i++) {
                    cbs[i].checked = this.checked;
                }
            }
        }
    </script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>

    <%--搜索的表单--%>
    <div style="float: left;">
        <form action="${pageContext.request.contextPath}/findUserByServlet" class="form-inline" method="post">
            <div class="form-group">
                <label for="exampleInputName2">姓名</label>
                <input type="text" name="name" value="${requestScope.condition.name[0]}" class="form-control" id="exampleInputName2">
            </div>
            <div class="form-group">
                <label for="exampleInputName3">籍贯</label>
                <input type="text" name="adds" value="${requestScope.condition.adds[0]}" class="form-control" id="exampleInputName3">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail2">Email</label>
                <input type="text" name="email" value="${requestScope.condition.email[0]}" class="form-control" id="exampleInputEmail2">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>

    <div style="float: right; margin-bottom: 5px;">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp" role="button">添加联系人</a>
        <a class="btn btn-primary" href="javascript:void(0);" id="delSelected" role="button">删除选中</a>
    </div>

    <%--内容体--%>
    <form id="form" action="${pageContext.request.contextPath}/delSelectedServlet" method="post">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th><input type="checkbox" id="firstCb"></th>
                <th>编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>籍贯</th>
                <th>QQ</th>
                <th>邮箱</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${pb.list}" var="user" varStatus="s">
                <tr>
                    <td><input type="checkbox" id="cbs" name="uid" value="${user.id}"></td>
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.gender}</td>
                    <td>${user.age}</td>
                    <td>${user.adds}</td>
                    <td>${user.qq}</td>
                    <td>${user.email}</td>
                    <td>
                        <a class="btn btn-default btn-sm"
                           href="${pageContext.request.contextPath}/findUserServlet?id=${user.id}">修改</a>&nbsp;
                        <a class="btn btn-default btn-sm" href="javascript:delUser(${user.id})">删除</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </form>

    <%--分页--%>
    <div>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <c:if test="${pb.currentPage==1}">
                <li class="disabled">
                    </c:if>
                    <c:if test="${pb.currentPage!=1}">
                <li>
                    </c:if>

                    <a href="${pageContext.request.contextPath}/findUserByServlet?currentPage=${pb.currentPage-1}&rows=5&name=${condition.name[0]}&adds=${condition.adds[0]}&email=${condition.email[0]}"
                       aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>

                <c:forEach begin="1" end="${pb.totalPage}" var="i">
                    <c:if test="${pb.currentPage == i}">
                        <li class="active">
                            <a href="${pageContext.request.contextPath}/findUserByServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&adds=${condition.adds[0]}&email=${condition.email[0]}">${i}</a>
                        </li>
                    </c:if>
                    <c:if test="${pb.currentPage != i}">
                        <li>
                            <a href="${pageContext.request.contextPath}/findUserByServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&adds=${condition.adds[0]}&email=${condition.email[0]}">${i}</a>
                        </li>
                    </c:if>
                </c:forEach>


                <c:if test="${pb.currentPage==pb.totalPage}">
                <li class="disabled">
                    </c:if>
                    <c:if test="${pb.currentPage!=pb.totalPage}">
                <li>
                    </c:if>

                    <a href="${pageContext.request.contextPath}/findUserByServlet?currentPage=${pb.currentPage+1}&rows=5&name=${condition.name[0]}&adds=${condition.adds[0]}&email=${condition.email[0]}"
                       aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <span style="margin-left: 5px ; font-size: 24px">共${pb.totalCount}条记录，共${pb.totalPage}页</span>
            </ul>
        </nav>
    </div>

</div>
</body>
</html>
