Action()
{

	web_set_sockets_option("SSL_VERSION", "TLS1.2");

	web_add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	web_add_auto_header("Sec-Fetch-Site", 
		"none");

	web_url("bins.json", 
		"URL=https://www.gstatic.com/autofill/hourly/bins.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		LAST);

	web_url("merchants.json", 
		"URL=https://www.gstatic.com/autofill/weekly/merchants.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		LAST);

	web_add_header("A-IM", 
		"x-bm,gzip");

	lr_think_time(5);

	web_url("seed", 
		"URL=https://clientservices.googleapis.com/chrome-variations/seed?osname=win&channel=stable&milestone=79", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		LAST);

	web_revert_auto_header("Sec-Fetch-Mode");

	web_revert_auto_header("Sec-Fetch-Site");

	web_add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	web_url("demo.opencart.com", 
		"URL=http://demo.opencart.com/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_ext_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://demo.opencart.com/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0", "Referer=https://demo.opencart.com/catalog/view/javascript/font-awesome/css/font-awesome.min.css", ENDITEM, 
		"Url=https://fonts.gstatic.com/s/opensans/v17/mem5YaGs126MiZpBA-UN7rgOUuhp.woff2", "Referer=https://fonts.googleapis.com/css?family=Open+Sans:400,400i,300,700", ENDITEM, 
		"Url=https://fonts.gstatic.com/s/opensans/v17/mem8YaGs126MiZpBA-UFVZ0b.woff2", "Referer=https://fonts.googleapis.com/css?family=Open+Sans:400,400i,300,700", ENDITEM, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZ5YRr3Z-avlkjLWdns_4kFA==", "Referer=", ENDITEM, 
		LAST);

	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_revert_auto_header("Upgrade-Insecure-Requests");

	web_add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_header("Sec-Fetch-User", 
		"?1");

	web_link("Laptops & Notebooks", 
		"Text=Laptops & Notebooks", 
		"Snapshot=t13.inf", 
		EXTRARES, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZ6JN5SlT0ymYjLWdns_4kIy2Ky66hJCMtd03WwyQU", "Referer=", ENDITEM, 
		LAST);

	web_add_auto_header("Sec-Fetch-Mode", 
		"cors");

	web_add_header("Origin", 
		"https://demo.opencart.com");

	web_add_header("X-Requested-With", 
		"XMLHttpRequest");

	lr_think_time(7);

	web_submit_data("index.php", 
		"Action=https://demo.opencart.com/index.php?route=checkout/cart/add", 
		"Method=POST", 
		"RecContentType=application/json", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=18", 
		"Snapshot=t14.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=product_id", "Value=47", ENDITEM, 
		"Name=quantity", "Value=1", ENDITEM, 
		LAST);

	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_header("Sec-Fetch-User", 
		"?1");

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	web_url("index.phplr_start_transaction("add");
_2", 
		"URL=https://demo.opencart.com/index.php?route=product/product&product_id=47", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=18", 
		"Snapshot=t15.inf", 
		"Mode=HTML", 
		LASlr_end_transaction("", LR_AUTO);
T);

	return 0;
}