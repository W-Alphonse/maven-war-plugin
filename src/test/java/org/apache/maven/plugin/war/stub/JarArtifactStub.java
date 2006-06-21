package org.apache.maven.plugin.war.stub;

/*
 * Copyright 2001-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.artifact.handler.ArtifactHandler;

import java.io.File;

public class JarArtifactStub
    extends AbstractArtifactStub
{
    protected String groupId;

    private ArtifactHandler artifactHandler;

    public JarArtifactStub( String basedir, ArtifactHandler artifactHandler )
    {
        super( basedir );
        this.artifactHandler = artifactHandler;
    }

    public void setGroupId( String id )
    {
        groupId = id;
    }

    public String getGroupId()
    {
        if ( groupId != null )
        {
            return groupId;
        }
        else
        {
            return "org.sample.jar";
        }
    }

    public String getType()
    {
        return "jar";
    }

    public String getArtifactId()
    {
        return "jarartifact";
    }

    public File getFile()
    {
        return new File( basedir, "/target/test-classes/unit/sample_wars/simple.jar" );
    }

    public ArtifactHandler getArtifactHandler()
    {
        return artifactHandler;
    }
}