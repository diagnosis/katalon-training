import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.json.JSONObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS



res  = WS.sendRequest(findTestObject('REST/ReqresRest'))

slurper = new JSONObject(res.getResponseBodyContent());
//result = slurper.parseText(res.getResponseBodyContent())
getNext =  new JSONObject((String) slurper.get("data").replace("[", "").replace("]", ""))
println getNext;
WS.sendRequest(findTestObject('REST/update'))

