/*
 * ***************************************************
 * 
 * cismet GmbH, Saarbruecken, Germany
 * 
 *               ... and it just works.
 * 
 * ***************************************************
 */
package eu.crismaproject;

import java.net.URL;

/**
 * A Software Component that has been selected, extended or implemented by
 * the CRISMA Consortium to realise a certain Building Block.
 * 
 * @author Pascal Dihé <pascal.dihe@cismet.de>
 */
public class SoftwareComponent
{
    /**
     * Enumeration of development contexts of the Software Component.</br>
     * <ul><li><strong>New</strong>: The Software Component a result of the CRISMA project and
     * has been implemented from scratch.</li>
     * <li><strong>Extended</strong>: The Software Component is based on existing 
     * software which has been directly extended or adapted to suit the needs of CRISMA.</li>
     * <li><strong>Extended</strong>: The Software Component is entirely based
     * on existing software, no changes to the source code of the existing software 
     * are necessary or planned.</li></ul>
     */
    public enum SoftwareComponentDevelopmentContext
    {
        New, Extended, Used
    }
    
    /**
     * Reference to the Building Block that is realised by this Software Component.
     */
    public BuildingBlock buildingBlock;
    
    
    /**
     * Defines the context of development activities of the Software Component in CRISMA.</br>
     * <ul><li><strong>New</strong>: The Software Component a result of the CRISMA project and
     * has been implemented from scratch.</li>
     * <li><strong>Extended</strong>: The Software Component is based on existing 
     * software which has been directly extended or adapted to suit the needs of CRISMA.</li>
     * <li><strong>Extended</strong>: The Software Component is entirely based
     * on existing software, no changes to the source code of the existing software 
     * are necessary or planned.</li></ul>
     */
    public SoftwareComponentDevelopmentContext developmentContext;
    
    
    /**
     * Name of the owner of the background software If the development context of the Software Component is <em>Extended</em> or
     * <em>Used</em>.
     */
    public String backgroundOwner;
    
     /**
     * Name of the owner of the Software Component (foreground).
     * If the development context of the Software Component is <em>Used</em>, 
     * this field is empty.
     */
    public String owner;

    /**
     * Defines the (technical type) type of the Software Component. 
     * This is an open list. some types to chose from are:<br/>
     * <ul><li>Wirecloud Widget</li>
     * <li>Desktop Application</li>
     * <li>OGC Service</li>
     * <li>Integration Platform</li>
     * <li>JavaScript Framework</li>
     * <li>...</li></ul>
     */
    public String[] type;
    
    /**
     * This describes the development status of the Software Component, e.g.
     * early prototype, preview version, final release, 
     * no release available yet, etc.
     */
    public String developmentStatus;
    
    /**
     * Describes current version number of the Software Component, e.g. 1.0 
     */
    public String version;
    
    
    /**
     * Short description (summary) of this Software Component. 
     * Plaintext, maximum 3-5 lines.
     */
    public String summary;
    
    /**
     * Long description of the Software Component. May include formatted text, bullet lists,
     * pictures, etc. Additionally, the description should provide technical details 
     * on the usage of Software Component, e.g. Hardware Requirements, supported Operating Systems, 
     * requirements for the installation (database, etc.), and so on.
     */
    public String description;
    
    
    /**
     * Name of the license of the background software on which the 
     * Software Component is based. If the development context 
     * of the Software Component is <em>New</em>, this field is empty.
     */
    public String backgroundLicense;
    
    /**
     * Name of the license of the Software Component (foreground) under which it is distributed 
     * by the CRISMA Consortium. If the development context of the Software Component
     * is <em>Used</em>, this field is empty.
     */
    public String license;
    
    /**
     * A link to the detailed Implementation Plan of the Software Component. These documents
     * are currently hosted on the VTT workspace and are visible to registered users only.
     */
    public URL implementationPlan;
    
    /**
     * Optional link to a website that describes the background software of this 
     * Software Component. Only relevant if the development context of the Software Component
     * is <em>Extended</em> or <em>Used</em>.
     */
    public URL backgroundSoftware;
    
    /**
     * If the Software Component is released under an open  source license, 
     * a link to the public software repository, e.g. github, should be provided.
     */
    public URL sourcecode;
    
    /**
     * If the Software Component can be distributed and or and 
     * installed independently of a complete CRISMA Application, a link to the binaries 
     * of the latest stable release can be provided.
     */
    public URL download;
    
    /**
     * If there exist online demos of the software, e.g. youtube videos, 
     * a web application (wirecloud), link should be provided.
     */
    public URL[] demo;
    
    /**
     * If there exist additional online documentation (e.g. user's guide, installation guide, etc.)
     * of the Software Components besides the Functional Building Block Descriptions
     * and the Implementation Plans, links should be provided.
     */
    public URL[] documentation;
}
