package cn.spring.simpleFX.controller;

import cn.spring.simpleFX.service.ITTMRateService;
import cn.spring.simpleFX.service.TTMRate;

import org.springframework.stereotype.Controller;

import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class TTMRateListController extends AbstractController {
    private ITTMRateService ttmRateService;
    private String viewName;
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        List<TTMRate> ttmRateList = getTtmRateService().getTTMRatesToday();
        ModelAndView mav = new ModelAndView(getViewName());
        mav.addObject("ttmRates", ttmRateList);
        return mav;
    }
    public ITTMRateService getTtmRateService() {
        return ttmRateService;
    }
    public void setTtmRateService(ITTMRateService ttmRateService) {
        this.ttmRateService = ttmRateService;
    }

    public String getViewName(){
             return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
