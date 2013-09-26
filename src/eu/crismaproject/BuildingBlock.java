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
 * A Functional Building Block of the CRISMA Framework Architecture.
 *
 * @author Pascal Dihé <pascal.dihe@cismet.de>
 */
public class BuildingBlock
{
    /**
     * Enumeration of Building Block Types.</br>
     * <ul><li><strong>Infrastructure</strong>: Building Block of the CRISMA Core</li>
     * <li><strong>Integration</strong>: Building Blocks for Data and Model Integration</li>
     * <li><strong>User Interaction</strong>: Graphical User Interface Building Blocks</li>
     * <li><strong>CRISMA Simulation Model</strong>: Crisis Management Simulation Models provided by SP4</li></ul>
     */
    public enum BuildingBlockType
    {
        Infrastructure, Integration, UserInteraction, SimulationModel
    }
    
    /**
     * The type of the Building Block. This is a fixed list of four types described 
     * in the CRISMA Framework Architecture. A Building Block may be assigned to 
     * two types, e.g. User Interaction and Integration.</br>
     * <ul><li><strong>Infrastructure</strong>: Building Block of the CRISMA Core</li>
     * <li><strong>Integration</strong>: Building Blocks for Data and Model Integration</li>
     * <li><strong>User Interaction</strong>: Graphical User Interface Building Blocks</li>
     * <li><strong>CRISMA Simulation Model</strong>: Crisis Management Simulation Models provided by SP4</li></ul>
     */
    public BuildingBlockType[] type;
    
    /**
     * Short description (summary) of this Building Block. 
     * Plaintext, maximum 3-5 lines.
     */
    public String summary;
    
    /**
     * Long description of the Building Block. May include formatted text, 
     * pictures, etc. The description should describe the key functionality
     * of the Building Block and its position in the CRISMA Framework Architecture.
     */
    public String description;
    
    /**
     * References to related Building Blocks, e.g. if the Building Block is a client of
     * an SP4 Simulation Model, a reference to the respective <em>CRISMA Simulation Model</em>
     * should be provided.
     */
    public BuildingBlock[] realtedBuildingBlocks;
    
    /**
    * Software Components for this Building Block that have been selected, 
    * extended or implemented by the CRISMA Consortium. One Building Block may
    * be realised by different Software Components, e.g. for the Data Integration
    * Building Block and the GIS Widget Building Block there exist different
    * implementations that can be used in a CRISMA Application.
    */
    public SoftwareComponent[] softwareComponents;
    
    /**
     * A link to the detailed Functional Description of the Building Block. These documents
     * are currently hosted on the VTT workspace and are visible to registered users only.
     */
    public URL functionalDescription;

}
