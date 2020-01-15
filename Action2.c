Action2()
{

	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_auto_header("Sec-Fetch-User", 
		"?1");

	web_add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(11);

	web_url("index.php_4", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=57", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=18&sort=p.price&order=DESC", 
		"Snapshot=t20.inf", 
		"Mode=HTML", 
		LAST);

	lr_think_time(4);

	web_url("index.php_5", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=57&sort=p.model&order=ASC", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=57", 
		"Snapshot=t21.inf", 
		"Mode=HTML", 
		LAST);

	web_url("index.php_6", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=57&sort=p.model&order=ASC&limit=25", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=57&sort=p.model&order=ASC", 
		"Snapshot=t22.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}
