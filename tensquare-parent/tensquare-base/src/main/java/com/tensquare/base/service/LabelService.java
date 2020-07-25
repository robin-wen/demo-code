package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import util.IdWorker;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 标签业务逻辑类
 */
@Service
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    /**
     * 查询所有标签
     *
     * @return
     */
    public List<Label> findAll() {
        return labelDao.findAll();
    }

    /**
     * 根据ID查询标签
     *
     * @param id
     * @return
     */
    public Label findLabelById(String id) {
        //int i = 1/0;
        return labelDao.findById(id).get();
    }

    /**
     * 增加标签
     */
    public void addLabel(Label label) {
        label.setId(idWorker.nextId() + "");
        labelDao.save(label);
    }

    /**
     * 修改标签
     */
    public void updateLabel(Label label) {
        labelDao.save(label);
    }

    /**
     * 根据Id删除标签
     */
    public void deleteLabel(String id) {
        labelDao.deleteById(id);
    }

    /**
     * 构造查询条件
     *
     * @param searchmap
     * @return
     */
    private Specification<Label> createSpecification(Map searchmap) {
        return new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {

                ArrayList<Predicate> list = new ArrayList<>();

                if (searchmap.get("labelname") != null && !"".equals(searchmap.get("labelname"))) {
                    Predicate predicate = cb.like(root.get("labelname").as(String.class), "%" + searchmap.get("labelname") + "%");
                    list.add(predicate);
                }
                if (searchmap.get("state") != null && !"".equals(searchmap.get("state"))) {
                    Predicate predicate = cb.equal(root.get("state").as(String.class), searchmap.get("state"));
                    list.add(predicate);
                }
                if (searchmap.get("count") != null && !"".equals(searchmap.get("count"))) {
                    Predicate predicate = cb.equal(root.get("count").as(String.class), searchmap.get("count"));
                    list.add(predicate);
                }
                if (searchmap.get("recommend") != null && !"".equals(searchmap.get("recommend"))) {
                    Predicate predicate = cb.equal(root.get("recommend").as(String.class), searchmap.get("recommend"));
                    list.add(predicate);
                }
                return cb.and(list.toArray(new Predicate[list.size()]));
            }
        };
    }

    /**
     * 根据条件查询
     *
     * @param searchmap
     * @return
     */
    public List<Label> findByConditon(Map searchmap) {
        Specification<Label> specification = createSpecification(searchmap);
        return labelDao.findAll(specification);
    }

    /**
     * 根据条件分页查询
     *
     * @param searchmap
     * @param page
     * @param size
     * @return
     */
    public Page<Label> findByConditonandPage(Map searchmap, int page, int size) {
        Specification<Label> specification = createSpecification(searchmap);
        //要接口的实现类
        Pageable pageAble = PageRequest.of(page - 1, size);
        return labelDao.findAll(specification, pageAble);
    }
}
