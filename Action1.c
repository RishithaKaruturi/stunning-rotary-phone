Action1()
{

	web_add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_auto_header("Sec-Fetch-User", 
		"?1");

	web_add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(7);
lr_start_transaction("account");

	web_url("index.php_2", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=18", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=account/account", 
		"Snapshot=t18.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("account", LR_AUTO);

	lr_think_time(4);

	web_url("index.php_3", 
		"URL=https://demo.opencart.com/index.php?route=product/category&path=18&sort=p.price&order=DESC", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=18", 
		"Snapshot=t19.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}
