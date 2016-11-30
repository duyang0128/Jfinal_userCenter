<#macro head title>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>${title}</title>
<meta name="copyright" content="crowdSourcing" />
<script>
    var Label = {
        devMode:${devMode?c},
        staticServePath:'${staticServePath}'
    }
</script>
<link rel="stylesheet" href="${staticServePath}/assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="${staticServePath}/static/css/base.css?${staticResourceVersion}" />
    <#nested>
</#macro>