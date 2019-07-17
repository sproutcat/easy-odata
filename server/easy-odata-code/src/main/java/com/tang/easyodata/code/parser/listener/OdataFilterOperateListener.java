package com.tang.easyodata.code.parser.listener;


import com.tang.easyodata.code.parser.ast.OdataFilterBaseListener;
import com.tang.easyodata.code.parser.ast.OdataFilterParser;
import com.tang.easyodata.code.model.OdataFilter;
import com.tang.easyodata.code.model.enums.OdataFilterOperateEnum;
import com.tang.easyodata.code.toolkit.OdataUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Description: odata 过滤条件解析监听
 *
 * @Author: tzg
 * @Date: 2017/8/14 11:41
 */
//@Slf4j
public class OdataFilterOperateListener extends OdataFilterBaseListener {

    /**
     * 过滤条件
     */
    private OdataFilter filter;

    public OdataFilter getFilter() {
        return filter;
    }

    @Override
    public void enterCriteriaExpression(OdataFilterParser.CriteriaExpressionContext ctx) {
//        log.debug("OR : {} , {}", ctx.getText(), ctx.criteriaIterm());
        OdataFilterLogicListenrer oll = new OdataFilterLogicListenrer();
        ctx.criteriaIterm().forEach(x -> x.enterRule(oll));
        List<OdataFilter> filters = oll.getFilterList();
        if (!CollectionUtils.isEmpty(filters)) {
            this.filter = filters.size() == 1 ? filters.get(0) :
                    new OdataFilter(null, OdataFilterOperateEnum.OR, filters);
        }
    }

    @Override
    public void enterSimpleCriteria(OdataFilterParser.SimpleCriteriaContext ctx) {
        if (null != ctx.criteriaLike()) {
            ctx.criteriaLike().enterRule(this);
        } else if (null != ctx.criteriaNotLike()) {
            ctx.criteriaNotLike().enterRule(this);
        } else if (null != ctx.criteriaOther()) {
            ctx.criteriaOther().enterRule(this);
        }
    }

    @Override
    public void enterCriteriaLike(OdataFilterParser.CriteriaLikeContext ctx) {
//        log.debug("like : {}", ctx.getText());
        this.filter = new OdataFilter(
                OdataUtils.filterFieldName(ctx.field().getText()),
                OdataFilterOperateEnum.LIKE,
                OdataUtils.filterValue(ctx.STRING().getText())
        );
    }

    @Override
    public void enterCriteriaStartswith(OdataFilterParser.CriteriaStartswithContext ctx) {
//        log.debug("startswith : {}", ctx.getText());
        this.filter = new OdataFilter(
                OdataUtils.filterFieldName(ctx.field().getText()),
                OdataFilterOperateEnum.STARTSWITH,
                OdataUtils.filterValue(ctx.STRING().getText())
        );
    }

    @Override
    public void enterCriteriaEndswith(OdataFilterParser.CriteriaEndswithContext ctx) {
//        log.debug("endswith : {}", ctx.getText());
        this.filter = new OdataFilter(
                OdataUtils.filterFieldName(ctx.field().getText()),
                OdataFilterOperateEnum.ENDSWITH,
                OdataUtils.filterValue(ctx.STRING().getText())
        );
    }

    @Override
    public void enterCriteriaNotLike(OdataFilterParser.CriteriaNotLikeContext ctx) {
//        log.debug("not_like : {}", ctx.getText());
        this.filter = new OdataFilter(
                OdataUtils.filterFieldName(ctx.field().getText()),
                OdataFilterOperateEnum.NOT_LIKE,
                OdataUtils.filterValue(ctx.STRING().getText())
        );
    }

    @Override
    public void enterCriteriaOther(OdataFilterParser.CriteriaOtherContext ctx) {
//        log.debug("other : {}", ctx.getText());
        this.filter = new OdataFilter(
                OdataUtils.filterFieldName(ctx.field().getText()),
                OdataFilterOperateEnum.valueOf(ctx.operate().getText().toUpperCase()),
                OdataUtils.filterValue(ctx.value().getText())
        );
    }

}
