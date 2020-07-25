package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 标签管理的控制器
 */
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    /**
     * 查询所有标签
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAllLabel() {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findAll());
    }

    /**
     * 根据id查询标签
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findLabelById(@PathVariable String id) {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findLabelById(id));
    }

    /**
     * 增加标签
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result addLabel(@RequestBody Label label) {
        labelService.addLabel(label);
        return new Result(true, StatusCode.OK, "增加成功");
    }

    /**
     * 修改标签
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result updateLabel(@PathVariable String id, @RequestBody Label label) {
        label.setId(id);
        labelService.updateLabel(label);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /**
     * 删除标签
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result deleteLabel(@PathVariable String id) {
        labelService.deleteLabel(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    /**
     * 根据条件查询
     *
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public Result findByConditon(@RequestBody Map searchmap) {
        List<Label> list = labelService.findByConditon(searchmap);
        return new Result(true, StatusCode.OK, "查询成功！", list);
    }

    /**
     * 条件带分页查询
     *
     * @param searchmap
     * @return
     */
    @RequestMapping(value = "/search/{page}/{size}", method = RequestMethod.POST)
    public Result findByConditon(@RequestBody Map searchmap, @PathVariable int page, @PathVariable int size) {
        Page<Label> pageData = labelService.findByConditonandPage(searchmap, page, size);
        return new Result(true, StatusCode.OK, "查询成功！", new PageResult<Label>(pageData.getTotalElements(), pageData.getContent()));
    }
}
