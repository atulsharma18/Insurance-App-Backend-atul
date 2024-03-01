package com.nagarro.insurancedetails.entity;




import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;



@Entity
public class RouteEntity {

    @Id
    private String id; // or any other appropriate identifier

    private String remoteEntry;
    private String remoteName;
    private String exposedModule;
    private String module;


	public RouteEntity(String id, String remoteEntry, String remoteName, String exposedModule, String module) {
		super();
		this.id = id;
		this.remoteEntry = remoteEntry;
		this.remoteName = remoteName;
		this.exposedModule = exposedModule;
		this.module = module;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRemoteEntry() {
		return remoteEntry;
	}
	public void setRemoteEntry(String remoteEntry) {
		this.remoteEntry = remoteEntry;
	}
	public String getRemoteName() {
		return remoteName;
	}
	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}
	public String getExposedModule() {
		return exposedModule;
	}
	public void setExposedModule(String exposedModule) {
		this.exposedModule = exposedModule;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}


}
