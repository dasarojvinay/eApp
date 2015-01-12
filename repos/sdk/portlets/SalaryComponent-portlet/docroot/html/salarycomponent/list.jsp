<%@page import="com.rknowsys.eapp.hrm.service.SalaryComponentLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.SalaryComponent"%>
<%@page import="com.rknowsys.eapp.CustomComparatorUtil"%>
<%@ include file="/html/salarycomponent/init.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salary Component</title>
<portlet:actionURL var="savesalarycomponent" name="saveSalaryComponent">
</portlet:actionURL>
<portlet:renderURL var="addcomponent">
	<portlet:param name="mvcPath" value="/html/salarycomponent/addsalarycomponent.jsp" />
</portlet:renderURL>
<portlet:resourceURL var="deletesalarycomponent" id="deleteSalaryComponent"/>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/salarycomponent/list.jsp" />
</portlet:renderURL>
<style type="text/css">
em {
	color: red;
}
.table-first-header {
	width: 10%;
}
.table-last-header {
	width: 15%;
}
</style>

<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#delete');
    node.on(
      'click',
      function() {
     var salidArray = [];
     A.all('input[name=<portlet:namespace/>rowIds]:checked').each(function(object) {
      salidArray.push(object.get("value"));
    
        });
       if(salidArray==""){
			  alert("Please select records!");
		  }else{
			  var d = confirm("Are you sure you want to delete the selected salary component ?");
		  if(d){
		   var url = '<%=deletesalarycomponent%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />salarycomponentIds: salidArray,  
                 },
          on: {
               success: function() { 
                   alert('deleted successfully');
                   window.location='<%=listview%>';
              },
               failure: function() {
                  
                 }
                }
                 }
                );
		  																		
		  console.log(salidArray);
	  
      return true;
  }
  else
    return false;
}             
      }
    );
  }
);

</aui:script>

</head>
<body>
<h6></h6>

<a href="<%=addcomponent%>">Add</a> &nbsp;&nbsp;&nbsp;&nbsp;    <a href="#" id="delete">Delete</a>

<%

PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/salarycomponent/list.jsp");
RowChecker rowChecker = new RowChecker(renderResponse);

PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request); 
String sortByCol = ParamUtil.getString(request, "orderByCol"); 
String sortByType = ParamUtil.getString(request, "orderByType"); 
System.out.println("sortByCol == " +sortByCol);
System.out.println("sortByType == " +sortByType);
if (Validator.isNotNull(sortByCol ) && Validator.isNotNull(sortByType )) { 
	System.out.println("if block...");
 
portalPrefs.setValue("NAME_SPACE", "sort-by-col", sortByCol); 
portalPrefs.setValue("NAME_SPACE", "sort-by-type", sortByCol); 
 
} else { 
 
	
	sortByType = portalPrefs.getValue("NAME_SPACE", "sort-by-type ", "asc");   
}

System.out.println("after....");
System.out.println("sortByCol == " +sortByCol);
System.out.println("sortByType == " +sortByType);

%>
<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<SalaryComponent> searchContainer;
%>

<liferay-ui:search-container orderByCol="<%=sortByCol %>"
	orderByType="<%=sortByType %>"
	rowChecker="<%= new RowChecker(renderResponse) %>" delta="5"
	emptyResultsMessage="No records is available for SalaryComponent"
	deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
	<liferay-ui:search-container-results>
	<%
			List<SalaryComponent> salarycomponentlist = SalaryComponentLocalServiceUtil.getSalaryComponents(searchContainer.getStart(), searchContainer.getEnd());
            System.out.println("list size == " +salarycomponentlist.size());
            OrderByComparator orderByComparator = CustomComparatorUtil.getSalaryComponentOrderByComparator(sortByCol, sortByType);         
  
           Collections.sort(salarycomponentlist,orderByComparator);
  
          results = salarycomponentlist;
          
            System.out.println("results == " +results);
           
     
               total = SalaryComponentLocalServiceUtil.getSalaryComponentsCount();
               System.out.println("total == " +total);
               pageContext.setAttribute("results", results);
               pageContext.setAttribute("total", total);
 %>

	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="SalaryComponent"
		keyProperty="salaryComponentId" modelVar="SalaryComponent" rowVar="curRow"
		escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text orderable="<%=true %>"
			name="Component Name" property="componentName"
			orderableProperty="componentName" /> 
		<liferay-ui:search-container-column-text orderable="<%=true %>" name="Type" property="type" orderableProperty="type"/>
		<liferay-ui:search-container-column-text orderable="<%=true %>" name="Total Payable" property="totalPayable" orderableProperty="totalPayable"/>
		<liferay-ui:search-container-column-text orderable="<%=true %>" name="Cost To Company" property="costToCompany" orderableProperty="costToCompany"/>
		<liferay-ui:search-container-column-jsp name="Edit"
			path="/html/salarycomponent/edit.jsp" />
	
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />

</liferay-ui:search-container>


</body>
</html>