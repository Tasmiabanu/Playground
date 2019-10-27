var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
function loadXML(xmlFile)
{
  xmlDoc.async="false";
  xmlDoc.onreadystatechange=verify;
  xmlDoc.load(xmlFile);
  xmlObj=xmlDoc.documentElement;
}
function verify()
{
  if (xmlDoc.readyState != 4)
  {
    return false;
  }
}

loadXML('w3c.xml');