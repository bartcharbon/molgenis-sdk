<#include "molgenis-header.ftl">
<#include "molgenis-footer.ftl">

<#assign js=["dalliance-all.custom.js", "biodalliance-genome-browser.js", "information-table.js", "DataTables-1.9.4/media/js/jquery.dataTables.js"]>
<#assign css=["bootstrap-scoped.css", "dalliance-scoped.css", "DataTables-1.9.4/media/css/demo_table.css"]>

<@header css js/>
	<div id="header">	
		<p>
			Genome Browser
		</p>
	</div>
	
	<div id="svgHolder" style="width:1180px"></div>
	
	<div id="tableHolder" style="width:1180px">
		<table id="patientData" border="1">
		</table>
	</div>
<@footer/>
