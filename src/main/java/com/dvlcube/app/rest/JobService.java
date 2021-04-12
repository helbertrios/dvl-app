package com.dvlcube.app.rest;


import com.dvlcube.app.interfaces.MenuItem;
import com.dvlcube.app.manager.data.JobBean;
import com.dvlcube.app.manager.data.SkillBean;
import com.dvlcube.app.manager.data.vo.MxRestResponse;
import com.dvlcube.utils.interfaces.rest.MxFilterableBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import static com.dvlcube.app.manager.data.e.Menu.CONFIGURATION;

import com.dvlcube.app.jpa.repo.JobRepository;

import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;

@RestController
@MenuItem(value = CONFIGURATION)
@RequestMapping("${dvl.rest.prefix}/jobs")
public class JobService implements MxFilterableBeanService<JobBean, Long> {

    @Autowired
    private JobRepository repo;

    @Override
    @GetMapping
    public Iterable<JobBean> get(@RequestParam Map<String, String> params) {
        return repo.firstPage(Sort.by(Sort.Direction.ASC, JobBean.NAME));
    }

    @Override
    @GetMapping("/{id}")
    public Optional<JobBean> get(@PathVariable Long id) {
        return repo.findById(id);
    }

    @Override
    @PostMapping
    public MxRestResponse post(@Valid @RequestBody JobBean body) {
        JobBean save = repo.save(body);
        return GenericRestResponse.ok(save.getId());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @GetMapping("/like")
    public Iterable<JobBean> getLike(@RequestParam(required = true) String name) {
        return repo.findAllLike(name,  JobBean.NAME);
    }

}
