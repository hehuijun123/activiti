package com.ssh.action;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.CompanyService;
import com.ssh.service.EmergencyService;
import com.ssh.service.ExcelFileService;
import com.ssh.service.HazardousChemicalsService;
import com.ssh.service.LogService;
import com.ssh.service.PositionService;
import com.ssh.service.PurchaseService;
import com.ssh.service.PurposeService;
import com.ssh.service.RightService;
import com.ssh.service.RoleService;
import com.ssh.service.StorageService;
import com.ssh.service.TransportService;
import com.ssh.service.UserService;

import com.ssh.service.WasteService;
import com.ssh.service.impl.StoragehouseServiceImpl;




public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	/*private Logger log = Logger.getLogger("BaseAction �е���־");*/
 	private static final long serialVersionUID = -1040212988363452551L;
	
	//======service======
    
	@Resource
	protected CompanyService companyService;
	@Resource
	protected EmergencyService emergencyService  ;
	@Resource
	protected HazardousChemicalsService hazardousChemicalsService;
	@Resource
	protected PurchaseService purchaseService;
	@Resource
	protected PurposeService purposeService ;
	@Resource
	protected StorageService storageService ;
	@Resource
	protected StoragehouseServiceImpl storagehouseService ;
	@Resource
	protected TransportService transportService ;
	@Resource
	protected UserService userService ;
	@Resource
	protected WasteService wasteService ;
	@Resource
	protected LogService logService ;
	@Resource
	protected RightService rightService ;
	@Resource
	protected RoleService roleService ;
	@Resource
	protected ExcelFileService excelFileService ;
	@Resource
	protected PositionService positionService ;

		
	//=====��ҳ��ص�  page  rows (������String ���� int �����޸�)=====
	
	protected String page;
	protected String rows;
	

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}
	
	//=============ModelDriven  ��֧��====
	protected T model;
	
	public BaseAction(){
		try {
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			model = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public T getModel() {
		return model;
	}
	
	
	//====================================
	
    protected HttpServletRequest request;
    protected ServletContext application;
    protected HttpServletResponse response;
 
    /**
     * 
     * Description: ȡ��Request
     * 
     * @return HttpServletRequest
     * @see
     */
    public HttpServletRequest getRequest()
    {
        return ServletActionContext.getRequest();
    }

    /**
     * 
     * Description: ȡ��Response
     * 
     * @return HttpServletResponse
     * @see
     */
    public HttpServletResponse getResponse()
    {
        return ServletActionContext.getResponse();
    }
    /**
     * 
     * Description: ȡ��Attribute属�??
     * 
     * @param name
     * @param value 
     * @see
     */
    public void setAttribute(String name, Object value)
    {
        ServletActionContext.getRequest().setAttribute(name, value);
    }

    /**
     * 
     * Description: ����Attribute����
     * 
     * @param name
     * @return Object
     * @see
     */
    public Object getAttribute(String name)
    {
        return ServletActionContext.getRequest().getAttribute(name);
    }
    /**
     * 
     * Description: ȡ��Session
     * 
     * @return HttpSession
     * @see
     */
    public HttpSession getSession()
    {
        return getRequest().getSession();
    }
	
    /**
     * 
     * Description: 设置Session属�??
     * 
     * @param name
     * @param value 
     * @see
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void setSession(Object name, Object value)
    {
        ActionContext ctx = ActionContext.getContext();
        Map session = ctx.getSession();
        session.put(name, value);
    }
    /**
     * 
     * Description: 取得ServletContext
     * 
     * @return ServletContext
     * @see
     */
    public ServletContext getServletContext()
    {
        return ServletActionContext.getServletContext();
    }
    /**
     * ���Ӷ�json��ʽ��֧��
     * 
     * @param data
     */
    protected void response(String data)
    {
        try
        {
            this.getResponse().setCharacterEncoding("UTF-8");
            this.getResponse().setContentType("text/html;charset=UTF-8");
            this.getResponse().getWriter().write(data);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /**
     * ����һ��List����  ����ǰ̨һ��JSON
     * @param list
     */
    protected void response(List list)
    {
        try
        {
            this.getResponse().setCharacterEncoding("UTF-8");
            this.getResponse().setContentType("text/html;charset=UTF-8");
            //��List���л�Ϊ����ʽ��JSON�ı�
//             log.info(JSONObject.toJSONString(list));
            this.getResponse().getWriter().write(JSONObject.toJSONString(list,SerializerFeature.DisableCircularReferenceDetect));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /**
     * ����һ��  Map ����     ����ǰ̨JSON
     * @param map
     */
    protected void response(Map map)
    {
        try
        {
            this.getResponse().setCharacterEncoding("UTF-8");
            this.getResponse().setContentType("text/html;charset=UTF-8");
            //��List���л�Ϊ����ʽ��JSON�ı�
//            log.info(JSONObject.toJSONString(map));
            this.getResponse().getWriter().write(JSONObject.toJSONString(map,SerializerFeature.DisableCircularReferenceDetect));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     *  ��ҳ������  ����  list  �� �ܸ��� total 
     * @param list
     * @param total
     */
    protected void response(List list, int total)
    {
        try
        {
            this.getResponse().setCharacterEncoding("UTF-8");
            this.getResponse().setContentType("text/html;charset=UTF-8");
            
            Map<String,Object> map =new HashMap<String, Object>();
            map.put("total", total);
            map.put("rows", list);
//            log.info(JSONObject.toJSONString(map));
            //��JavaBean���л�Ϊ����ʽ��JSON�ı�
            this.getResponse().getWriter().write(JSONObject.toJSONString(map,SerializerFeature.DisableCircularReferenceDetect));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /**
     * ����һ�� JavaBean ���� JSON
     * @param object
     */
    protected void response(Object object)
    {
        try
        {
            this.getResponse().setCharacterEncoding("UTF-8");
            this.getResponse().setContentType("text/html;charset=UTF-8");
            //��JavaBean���л�Ϊ����ʽ��JSON�ı�
//            log.info("baseAction respons Object�?"+JSONObject.toJSONString(object));
            this.getResponse().getWriter().write(JSONObject.toJSONString(object,SerializerFeature.DisableCircularReferenceDetect));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    
}
