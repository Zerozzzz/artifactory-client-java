package org.jfrog.artifactory.client.model.repository.settings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Ivan Vasylivskyi (ivanvas@jfrog.com)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public interface OpkgRepositorySettings extends RepositorySettings {

    // ** remote ** //

    Boolean getListRemoteFolderItems();

}
