<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="header.jsp" />
	<c:import url="navbar.jsp" />



	<div class="row mt-4">
		<div class="col-sm-4 ">
			<div class="alert alert-primary mt-4 mb-4" role="alert">Vendor
				Management Module</div>



			<ol class="list-group list-group-numbered">
				<li
					class="list-group-item d-flex justify-content-between align-items-start">
					<div class="ms-2 me-auto">
						<a href="<%=request.getContextPath()%>/add-vendor">
							<div class="fw-bold">Add New Vendor</div>
						</a> Record vendor details in the system
					</div> <span class="badge bg-primary rounded-pill">New</span>
				</li>

				<li
					class="list-group-item d-flex justify-content-between align-items-start">
					<div class="ms-2 me-auto">
						<a href="<%=request.getContextPath()%>/vendor-list">
							<div class="fw-bold">Vendor List</div>
						</a> All vendors in the System
					</div> <span class="badge bg-primary rounded-pill">14</span>
				</li>

				<li
					class="list-group-item d-flex justify-content-between align-items-start">
					<div class="ms-2 me-auto">
						<div class="fw-bold">Subheading</div>
						Content for list item
					</div> <span class="badge bg-primary rounded-pill">14</span>
				</li>
				<li
					class="list-group-item d-flex justify-content-between align-items-start">
					<div class="ms-2 me-auto">
						<div class="fw-bold">Subheading</div>
						Content for list item
					</div> <span class="badge bg-primary rounded-pill">14</span>
				</li>
			</ol>
		</div>
		<div class="col-sm-8"></div>
	</div>
</body>
</html>