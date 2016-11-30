<#macro foot>
<!-- basic scripts -->

<!--[if !IE]> -->
<script src="${staticServePath}/assets/js/jquery.2.1.1.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="${staticServePath}/assets/js/jquery.1.11.1.min.js"></script>
<![endif]-->

<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery.min.js'>" + "<" + "/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery1x.min.js'>" + "<" + "/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if ('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>

<script src="${staticServePath}/static/js/dev.js"></script>
    <#nested>
</#macro>