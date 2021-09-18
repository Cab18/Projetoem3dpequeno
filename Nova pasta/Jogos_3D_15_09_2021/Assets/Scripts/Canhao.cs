using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Canhao : MonoBehaviour
{
    public float delayInicial = 1f;

    public float delayEntreObjetos = 1f;
    
    public float forca = 100f;

     public GameObject baladeCanhaoPrefab;
    // Start is called before the first frame update
    void Start()
    {
        InvokeRepeating("GerarbaladeCanhao",delayInicial,delayEntreObjetos);
    }

    
    void GerarbaladeCanhao()
    {
       var balaDeCanhao = Instantiate(baladeCanhaoPrefab,transform.position,transform.rotation);

       var rb = balaDeCanhao.GetComponent<Rigidbody>();

       rb.AddRelativeForce(Vector3.up * forca);
    }
}
