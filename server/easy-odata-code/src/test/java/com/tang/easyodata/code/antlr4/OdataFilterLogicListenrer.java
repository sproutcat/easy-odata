package com.tang.easyodata.code.antlr4;


import com.tang.easyodata.code.antlr4.ast.OdataFilterBaseListener;
import com.tang.easyodata.code.antlr4.ast.OdataFilterParser;
import com.tang.easyodata.code.model.OdataFilter;
import com.tang.easyodata.code.model.enums.OdataFilterOperateEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: odata逻辑操作监听
 *
 * @Author: tzg
 * @Date: 2017/8/15 12:07
 */
@Slf4j
public class OdataFilterLogicListenrer extends OdataFilterBaseListener {

    /**
     * 过滤条件
     */
    private List<OdataFilter> filterList = new ArrayList<>();


    public List<OdataFilter> getFilterList() {
        return filterList;
    }

    @Override
    public void enterCriteriaIterm(OdataFilterParser.CriteriaItermContext ctx) {
        log.debug("AND : {}", ctx.getText());
        OdataFilterLogicListenrer oll = new OdataFilterLogicListenrer();
        ctx.criteriaFactor().forEach(x -> x.enterRule(oll));
        List<OdataFilter> filters = oll.getFilterList();
        if (CollectionUtils.isEmpty(filters)) {
            this.filterList.add(filters.size() == 1 ? filters.get(0) :
                    new OdataFilter(null, OdataFilterOperateEnum.AND, filters));
        }
    }

    @Override
    public void enterCriteriaFactor(OdataFilterParser.CriteriaFactorContext ctx) {
        log.debug("factor : {}", ctx.getText());
        OdataFilterOperateListener ocl = new OdataFilterOperateListener();
        if (null != ctx.simpleCriteria()) {
            ctx.simpleCriteria().enterRule(ocl);
        } else if (null != ctx.criteriaExpression()) {
            ctx.criteriaExpression().enterRule(ocl);
        }
        if (null != ocl.getFilter()) {
            filterList.add(ocl.getFilter());
        }
    }

}